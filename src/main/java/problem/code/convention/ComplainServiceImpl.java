package problem.code.convention;

import com.fasterxml.jackson.databind.ObjectMapper;
import problem.code.convention.dependency.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComplainServiceImpl {
    //TODO Code smell

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
        List<Map> rs = complainRepo.loadFullDataById(complainId);

        if (rs != null && rs.size() > 0) {
            ComplainDTO ret = objectMapper.convertValue(rs.get(0), ComplainDTO.class);

            CompType compType = compTypeService.findByCompTypeId(ret.getCompTypeId());
            ret.setGroupId(String.valueOf(compType.getGroupId()));
            if (ret.getSourceDuppId() != null) {
                ComplainDup complainDup = complainDupRepo.findByComplainIdNew(ret.getComplainId());
                ret.setDupNo(String.valueOf(complainDup.getDupNo()));
                Complain compSource = complainRepo.findByComplainId(ret.getSourceDuppId());
                ret.setStatus(compSource == null ? ret.getStatus() : compSource.getStatus());
            }

            if (!StringUtil.stringIsNullOrEmty(ret.getProvince())) {
                ret.setPrecinct(ret.getProvince().length() >= 9 ? ret.getProvince() : "");
                ret.setDistrict(ret.getProvince().length() >= 6 ? ret.getProvince().substring(0, 6) : "");
                ret.setProvince(ret.getProvince().substring(0, 3));
            }
            // attachment
            List<CompFileUpload> lsTmp = compFileUploadService.findByComplainId(ret.getComplainId());
            if (!StringUtil.isListEmpty(lsTmp)) {
                List<CompFileUpload> lstFile = lsTmp.stream().sorted(Comparator.comparing(CompFileUpload::getCreateDate).reversed()).collect(Collectors.toList());
                try {
                    FileUploadDTO attachment = (FileUploadDTO) StringUtil.jsonToObjectNotNull(lstFile.get(0).getAdditionalInfo(), FileUploadDTO.class);
                    attachment.setLink(compFileUploadService.getFileLinkById(baseUrl, lstFile.get(0).getFileId()));
                    attachment.setFileName(lstFile.get(0).getFileName());
                    ret.setAttachment(attachment);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // template content
            Map<String, String> mapTempValue = compTemplateContentService.getTemplateValue(ret.getComplainId());
            String tempId = Optional.ofNullable(mapTempValue.get("tempId")).orElseGet(() -> "");
            ret.setTemplate(mapTempValue);

            Long tempIdLong = null;
            if (!StringUtil.stringIsNullOrEmty(tempId)) {
                tempIdLong = Long.valueOf(tempId);
            }


            ret.setTempId(tempIdLong);

//  template value
//            if (!StringUtil.stringIsNullOrEmty(tempId)) {
//                ret.setListTempContent(templateComTempService.getTemplateComTemp(tempIdLong, null, null, null, null, null));
//                Template temp = templateRepo.getById(tempIdLong);
//
//                ret.setTempName(temp != null ? temp.getName() : "");
//
//            }

            // SLA info
            int sec = Integer.parseInt(StringUtil.nvl(ret.getSecondRemain(), "0"));
            int hour = Math.abs(sec / 3600);
            int minutes = Math.abs((sec % 3600) / 60);
            if (!"0".equals(ret.getSecondRemain())) {
                ret.setHourRemain((sec < 0 ? "-" : "") + hour + " giờ " + minutes + " phút");
            }
            if (!StringUtil.isEmptyString(ret.getSlaStatus())) {
                if (0 < Double.valueOf(ret.getSlaStatus()) && Double.valueOf(ret.getSlaStatus()) <= 0.8) {
                    ret.setSlaStatus("Bình thường");
                } else if (0.8 < Double.valueOf(ret.getSlaStatus()) && Double.valueOf(ret.getSlaStatus()) <= 1) {
                    ret.setSlaStatus("Sắp quá hạn");
                } else {
                    ret.setSlaStatus("Quá hạn");
                }
            }

            ret.setUserName(compProcessRepo.findByComplainIdAndStepAndStatus(complainId, ret.getCurrentStep(), "0")
                    .map(CompProcess::getUsername)
                    .orElse(""));

            return ret;
        }

        return null;
    }

}
