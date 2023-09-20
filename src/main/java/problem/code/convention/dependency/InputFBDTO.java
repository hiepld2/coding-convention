package problem.code.convention.dependency;

import java.io.Serializable;
import java.util.*;


public class InputFBDTO implements Serializable {

    // thông tin thuê bao
    private String isdn;
    private Long subId;
    //hình thức thanh toán
    private String payType;
    private String complainer;
    // sub_type:  C- trả trước; F-trả sau
    private String subType;
    private String idNo;
    private String payMethod;
    private String payAreaCode;
    private String address;

    private String customerType;//Loại khách hàng Vip;Hot:KHDN;KHCN
    // cen code của thuê bao
    private String cenCode;
    private String custName;


    // cen code của user nhập
    private String cenCodeUser;
    private String acceptUser;
    private String areaCode;

    private Long complainId;
    private Long compTypeId;
    private String compContent;
    private String callBackRequire;
    private String phone;
    private String networkIssue;
    private String vipCode;
    private Long acceptTypeId;
    private Long acceptSourceId;
    private String networkType;
    private String fromDateAbuse;
    private String toDateAbuse;
    private String urgent;
    private String province;
    private String district;
    private String precinct;
    private String complainType;
    private String status;
    private Long imProcess;
    private String vip;
    // số thuê bao quấy rối
    private String callingNumber;

    // chuyển phản ánh - khiếu nại
    private Long fbToKn;

    // step
    private Long step;

    private String note;// tin nhắn xử lý

    private Date feedbackDate;// ngày hồi âm báo nhận
    private Long compFeedbackTypeId; // hình thức hồi âm báo nhận
    private String cancel;//hoãn cắt

    private Long custType;


    private Long detailErrorId; //chi tiết lỗi
    private String strDetailError;

    private Long causeErrorId;// nguyên nhân lỗi
    private String strCauseError;

    private String compProvincePA;//Địa bàn phản ánh

    private String errorMessage;

    private Date limitDate;

    // trung tâm phản ánh
    private String compCenCode;
    private String serviceType;

    // thông tin thue bao bo sung
    private Integer vipTypeId;
    private Long corId;
    private String khcc;// khách hàng cước cao
    private String khnb;// khách hàng nội bộ

    private Date acceptDate;

    private Long depId;
    private Long shop;

    private FileUploadDTO attachment;

    private Map<String, String> template;

    private boolean closeNow;

    private Long sourceDuppId;
    private String groupId;

    private String lstIsdn;
    private String docNo;
    private Long policeOffice;

    private String preResult;

    private String inputCompContent;

    public InputFBDTO(Complain input) {
        super();
        isdn = input.getIsdn();
        subId = input.getSubId();
        subType = input.getSubType();
        customerType = input.getCustomerType();
        address = input.getAddress();
        idNo = input.getIdNo();
        depId = input.getDepId();

        complainId = input.getComplainId();
        compTypeId = input.getCompTypeId();
        compContent = input.getCompContent();
        acceptUser = input.getAcceptUser();
        acceptDate = input.getAcceptDate();
        if (!StringUtil.stringIsNullOrEmty(input.getProvince())) {
            precinct = input.getProvince().length() >= 9 ? input.getProvince() : "";
            district = input.getProvince().length() >= 6 ? input.getProvince().substring(0, 6) : "";
            province = input.getProvince().substring(0, 3);
        }
        complainer = input.getComplainer();
        cenCode = input.getCenCode();
        cenCodeUser = input.getCenCodeUser();
        callBackRequire = input.getCallBackRequire();
        complainType = input.getComplainType();
        status = input.getStatus();
        imProcess = input.getImProcess();
        phone = input.getPhone();
        networkIssue = input.getNetworkIssue();
//        vip = input.getVip();
        payMethod = input.getPayMethod();
        acceptTypeId = input.getAcceptTypeId();
        acceptSourceId = input.getAcceptSourceId();
        payAreaCode = input.getPayAreaCode();
        custType = input.getCustType();
        networkType = input.getType();
        limitDate = input.getLimitDate();
        urgent = input.getUrgent();
        payType = input.getPayType();
        compCenCode = input.getCompCenCode();
        closeNow = Objects.equals(2L, input.getTemporaryClose());
        detailErrorId = input.getDetailErrorId();
        sourceDuppId = input.getSourceDuppId();
        feedbackDate = input.getFeedbackDate();
        compFeedbackTypeId = input.getCompFeedbackTypeId();
        cancel = input.getCancel();
        shop = input.getShop();
        docNo = input.getDocNo();
        policeOffice = input.getPoliceOffice();
        note = input.getNote();
        fbToKn = input.getFbToKn();

        serviceType = input.getServiceType();

        if (!StringUtil.isListEmpty(input.getTemplates())) {
            template = convertTemplateValue(input.getTemplates());
        }
    }
    public static Map<String, String> convertTemplateValue(List<CompTemplateContent> lstTemp) {
        Map<String, String> result = new HashMap<>();
        try {
            if (!StringUtil.isListEmpty(lstTemp)) {
                for (CompTemplateContent compTemplateContent : lstTemp) {
                    result.put(compTemplateContent.getContentId().toString(), compTemplateContent.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getComplainer() {
        return complainer;
    }

    public void setComplainer(String complainer) {
        this.complainer = complainer;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPayAreaCode() {
        return payAreaCode;
    }

    public void setPayAreaCode(String payAreaCode) {
        this.payAreaCode = payAreaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCenCode() {
        return cenCode;
    }

    public void setCenCode(String cenCode) {
        this.cenCode = cenCode;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCenCodeUser() {
        return cenCodeUser;
    }

    public void setCenCodeUser(String cenCodeUser) {
        this.cenCodeUser = cenCodeUser;
    }

    public String getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(String acceptUser) {
        this.acceptUser = acceptUser;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    public Long getCompTypeId() {
        return compTypeId;
    }

    public void setCompTypeId(Long compTypeId) {
        this.compTypeId = compTypeId;
    }

    public String getCompContent() {
        return compContent;
    }

    public void setCompContent(String compContent) {
        this.compContent = compContent;
    }

    public String getCallBackRequire() {
        return callBackRequire;
    }

    public void setCallBackRequire(String callBackRequire) {
        this.callBackRequire = callBackRequire;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNetworkIssue() {
        return networkIssue;
    }

    public void setNetworkIssue(String networkIssue) {
        this.networkIssue = networkIssue;
    }

    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    public Long getAcceptTypeId() {
        return acceptTypeId;
    }

    public void setAcceptTypeId(Long acceptTypeId) {
        this.acceptTypeId = acceptTypeId;
    }

    public Long getAcceptSourceId() {
        return acceptSourceId;
    }

    public void setAcceptSourceId(Long acceptSourceId) {
        this.acceptSourceId = acceptSourceId;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getFromDateAbuse() {
        return fromDateAbuse;
    }

    public void setFromDateAbuse(String fromDateAbuse) {
        this.fromDateAbuse = fromDateAbuse;
    }

    public String getToDateAbuse() {
        return toDateAbuse;
    }

    public void setToDateAbuse(String toDateAbuse) {
        this.toDateAbuse = toDateAbuse;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPrecinct() {
        return precinct;
    }

    public void setPrecinct(String precinct) {
        this.precinct = precinct;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getImProcess() {
        return imProcess;
    }

    public void setImProcess(Long imProcess) {
        this.imProcess = imProcess;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getCallingNumber() {
        return callingNumber;
    }

    public void setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
    }

    public Long getFbToKn() {
        return fbToKn;
    }

    public void setFbToKn(Long fbToKn) {
        this.fbToKn = fbToKn;
    }

    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public Long getCompFeedbackTypeId() {
        return compFeedbackTypeId;
    }

    public void setCompFeedbackTypeId(Long compFeedbackTypeId) {
        this.compFeedbackTypeId = compFeedbackTypeId;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public Long getCustType() {
        return custType;
    }

    public void setCustType(Long custType) {
        this.custType = custType;
    }

    public Long getDetailErrorId() {
        return detailErrorId;
    }

    public void setDetailErrorId(Long detailErrorId) {
        this.detailErrorId = detailErrorId;
    }

    public String getStrDetailError() {
        return strDetailError;
    }

    public void setStrDetailError(String strDetailError) {
        this.strDetailError = strDetailError;
    }

    public Long getCauseErrorId() {
        return causeErrorId;
    }

    public void setCauseErrorId(Long causeErrorId) {
        this.causeErrorId = causeErrorId;
    }

    public String getStrCauseError() {
        return strCauseError;
    }

    public void setStrCauseError(String strCauseError) {
        this.strCauseError = strCauseError;
    }

    public String getCompProvincePA() {
        return compProvincePA;
    }

    public void setCompProvincePA(String compProvincePA) {
        this.compProvincePA = compProvincePA;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public String getCompCenCode() {
        return compCenCode;
    }

    public void setCompCenCode(String compCenCode) {
        this.compCenCode = compCenCode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getVipTypeId() {
        return vipTypeId;
    }

    public void setVipTypeId(Integer vipTypeId) {
        this.vipTypeId = vipTypeId;
    }

    public Long getCorId() {
        return corId;
    }

    public void setCorId(Long corId) {
        this.corId = corId;
    }

    public String getKhcc() {
        return khcc;
    }

    public void setKhcc(String khcc) {
        this.khcc = khcc;
    }

    public String getKhnb() {
        return khnb;
    }

    public void setKhnb(String khnb) {
        this.khnb = khnb;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getShop() {
        return shop;
    }

    public void setShop(Long shop) {
        this.shop = shop;
    }

    public FileUploadDTO getAttachment() {
        return attachment;
    }

    public void setAttachment(FileUploadDTO attachment) {
        this.attachment = attachment;
    }

    public Map<String, String> getTemplate() {
        return template;
    }

    public void setTemplate(Map<String, String> template) {
        this.template = template;
    }

    public boolean isCloseNow() {
        return closeNow;
    }

    public void setCloseNow(boolean closeNow) {
        this.closeNow = closeNow;
    }

    public Long getSourceDuppId() {
        return sourceDuppId;
    }

    public void setSourceDuppId(Long sourceDuppId) {
        this.sourceDuppId = sourceDuppId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getLstIsdn() {
        return lstIsdn;
    }

    public void setLstIsdn(String lstIsdn) {
        this.lstIsdn = lstIsdn;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Long getPoliceOffice() {
        return policeOffice;
    }

    public void setPoliceOffice(Long policeOffice) {
        this.policeOffice = policeOffice;
    }

    public String getPreResult() {
        return preResult;
    }

    public void setPreResult(String preResult) {
        this.preResult = preResult;
    }

    public String getInputCompContent() {
        return inputCompContent;
    }

    public void setInputCompContent(String inputCompContent) {
        this.inputCompContent = inputCompContent;
    }
}
