package solution.code.convention;

import com.fasterxml.jackson.databind.ObjectMapper;
import problem.code.convention.dependency.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ComplainServiceImpl {
    //TODO Code clean

    public static final String NORMAL = "Bình thường";
    public static final String ALMOST_EXPIRED = "Sắp quá hạn";
    public static final String EXPIRED = "Quá hạn";

    //region Initial objects - Ignore
    ObjectMapper objectMapper = new ObjectMapper();
    ComplainRepo complainRepo = new ComplainRepo();
    CompTypeService compTypeService = new CompTypeService();
    ComplainDupRepo complainDupRepo = new ComplainDupRepo();
    CompFileUploadService compFileUploadService = new CompFileUploadService();
    CompTemplateContentService compTemplateContentService = new CompTemplateContentService();
    CompProcessRepo compProcessRepo = new CompProcessRepo();
    //endregion

    public ComplainDTO loadFullDataById(Long complainId) {
        String baseUrl = FileUtil.getFileUploadBaseUrl();
        ComplainDTO complain = getComplainData(complainId);
        if (complain != null) {
            complain = buildSourceDuplicateInfo(complain);

            complain = buildLocationInfo(complain);

            complain.setAttachment(getFileAttachment(baseUrl, complainId));

            complain = buildTemplateInfo(complain);

            complain = buildSLAInfo(complain);

            complain.setUserName(compProcessRepo.findByComplainIdAndStepAndStatus(complainId, complain.getCurrentStep(), "0")
                    .map(CompProcess::getUsername).orElse(""));
            return complain;
        } else {
            return null;
        }
    }

    public ComplainDTO getComplainData(Long complainId) {
        List<Map> complainData = complainRepo.loadFullDataById(complainId);
        if (complainData != null && !complainData.isEmpty()) {
            ComplainDTO complain = objectMapper.convertValue(complainData.get(0), ComplainDTO.class);

            CompType compType = compTypeService.findByCompTypeId(complain.getCompTypeId());
            complain.setGroupId(String.valueOf(compType.getGroupId()));

            return complain;
        } else return null;
    }

    public ComplainDTO buildSourceDuplicateInfo(ComplainDTO complainDTO) {
        if (complainDTO.getSourceDuppId() != null) {
            ComplainDup complainDup = complainDupRepo.findByComplainIdNew(complainDTO.getComplainId());
            complainDTO.setDupNo(String.valueOf(complainDup.getDupNo()));

            Complain compSource = complainRepo.findByComplainId(complainDTO.getSourceDuppId());
            complainDTO.setStatus(compSource == null ? complainDTO.getStatus() : compSource.getStatus());
        }
        return complainDTO;
    }

    public ComplainDTO buildLocationInfo(ComplainDTO complainDTO) {
        if (!StringUtil.stringIsNullOrEmty(complainDTO.getProvince())) {
            complainDTO.setPrecinct(complainDTO.getProvince().length() >= 9 ? complainDTO.getProvince() : "");
            complainDTO.setDistrict(complainDTO.getProvince().length() >= 6 ? complainDTO.getProvince().substring(0, 6) : "");
            complainDTO.setProvince(complainDTO.getProvince().substring(0, 3));
        }
        return complainDTO;
    }

    public FileUploadDTO getFileAttachment(String baseUrl, Long complainId) {
        List<CompFileUpload> lstFileUpload = compFileUploadService.findByComplainId(complainId);
        if (!StringUtil.isListEmpty(lstFileUpload)) {
            try {
            CompFileUpload lastFile = lstFileUpload.stream().max(Comparator.comparing(CompFileUpload::getCreateDate)).get();
                FileUploadDTO attachment = (FileUploadDTO) StringUtil.jsonToObjectNotNull(lastFile.getAdditionalInfo(), FileUploadDTO.class);
                attachment.setLink(compFileUploadService.getFileLinkById(baseUrl, lastFile.getFileId()));
                attachment.setFileName(lastFile.getFileName());
                return attachment;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public ComplainDTO buildTemplateInfo(ComplainDTO complainDTO) {
        Map<String, String> templateValue = compTemplateContentService.getTemplateValue(complainDTO.getComplainId());
        complainDTO.setTemplate(templateValue);

        String tempId = templateValue.get("tempId");
        if (!StringUtil.stringIsNullOrEmty(tempId)) {
            complainDTO.setTempId(Long.parseLong(tempId));
        }

        return complainDTO;
    }

    public ComplainDTO buildSLAInfo(ComplainDTO complainDTO) {
        int timeRemainingInSec = Integer.parseInt(StringUtil.nvl(complainDTO.getSecondRemain(), "0"));
        int timeRemainingInHour = Math.abs(timeRemainingInSec / 3600);
        int timeRemainingInMinute = Math.abs((timeRemainingInSec % 3600) / 60);

        if (!"0".equals(complainDTO.getSecondRemain())) {
            complainDTO.setHourRemain((timeRemainingInSec < 0 ? "-" : "") + timeRemainingInHour + " giờ " + timeRemainingInMinute + " phút");
        }

        if (!StringUtil.stringIsNullOrEmty(complainDTO.getSlaStatus())) {
            if (0 < Double.parseDouble(complainDTO.getSlaStatus()) && Double.parseDouble(complainDTO.getSlaStatus()) <= 0.8) {
                complainDTO.setSlaStatus(NORMAL);
            } else if (0.8 < Double.parseDouble(complainDTO.getSlaStatus()) && Double.parseDouble(complainDTO.getSlaStatus()) <= 1) {
                complainDTO.setSlaStatus(ALMOST_EXPIRED);
            } else {
                complainDTO.setSlaStatus(EXPIRED);
            }
        }
        return complainDTO;
    }

}
