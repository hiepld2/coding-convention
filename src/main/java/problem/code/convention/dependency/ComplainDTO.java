package problem.code.convention.dependency;


import java.io.Serializable;
import java.util.*;



public class ComplainDTO extends Complain implements Serializable {

    public ComplainDTO(InputFBDTO input) {
        super(input);
    }

    private String depName;

    private String processComment;

    private String ticketType;

    private String timeRemain;

    private String secondRemain;

    private String hourRemain;

    private String paknStatus;

    private String orderDup;

    private String warningStatus;

    private String slaStatus;

    private String networkIssueName;

    private String detailErrorName;

    private Long currentCompProcessId;

    private String timeReceived;

    private Long temporaryClose;

    private String compGroupName;

    private String compTypeName;

    private Long compGroupId;

    private String respondTypeName;

    private String acceptTypeName;

    private String acceptSourceName;

    private String tempName;

    private Long tempId;

    private String shopName;

    private String statusName;

    private String serviceName;

    private String groupId;

    private String dupCompNumber;

    private String compFeedbackTypeName;

    private String dupNo;

    private String email;

    private String userGr;

    private String contentCmtInput;

    private String contentCmtGr;

    private String resultContentPreProcess;

    private String resultContentProcess;

    private String resultContentCallback;

    private Long stt;

    private String currentStepName;

    private String customerTypeName;

    private String complainIdDepId;

    private String infoPro;

    private String acceptUser;

    private String unitRequest;

    private String policeOfficeName;

    private String isValid;

    private Date returnDate;

    private Long depIdProcess;

    private String evaluate;

    List<TemplateComTemp> listTempContent;

    private List<Complain> listComplain;

    private List<InputFBDTO> listInputFBDTO;

    private Long listComplainCount;

    private Long listComplainCountAccept;

    private String userName;

    private Long center;

    //    private String province;
    private String district;
    private String precinct;
    private FileUploadDTO attachment;
    private String fileName;
    private Map<String, String> template;
    private String infoProcess;
    private String loginUser;

    private String fileStatus;
    private String lstIsdn;
    private String policeUnitName;
    private String infoProviderResult;
    private String link;
    private String unitReceipt;
    private String contentSms;
    private String inputInfor;
    private String sms5h;

    private String changeDate;

    public List<Object> getExcelRowHiddenBuilder() {
        return null;
    }

    private String vipGif;

    private List<String> lstStatus;

    private List<Long> lsDepId;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String getProcessComment() {
        return processComment;
    }

    @Override
    public void setProcessComment(String processComment) {
        this.processComment = processComment;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTimeRemain() {
        return timeRemain;
    }

    public void setTimeRemain(String timeRemain) {
        this.timeRemain = timeRemain;
    }

    public String getSecondRemain() {
        return secondRemain;
    }

    public void setSecondRemain(String secondRemain) {
        this.secondRemain = secondRemain;
    }

    public String getHourRemain() {
        return hourRemain;
    }

    public void setHourRemain(String hourRemain) {
        this.hourRemain = hourRemain;
    }

    public String getPaknStatus() {
        return paknStatus;
    }

    public void setPaknStatus(String paknStatus) {
        this.paknStatus = paknStatus;
    }

    public String getOrderDup() {
        return orderDup;
    }

    public void setOrderDup(String orderDup) {
        this.orderDup = orderDup;
    }

    public String getWarningStatus() {
        return warningStatus;
    }

    public void setWarningStatus(String warningStatus) {
        this.warningStatus = warningStatus;
    }

    @Override
    public String getSlaStatus() {
        return slaStatus;
    }

    @Override
    public void setSlaStatus(String slaStatus) {
        this.slaStatus = slaStatus;
    }

    public String getNetworkIssueName() {
        return networkIssueName;
    }

    public void setNetworkIssueName(String networkIssueName) {
        this.networkIssueName = networkIssueName;
    }

    public String getDetailErrorName() {
        return detailErrorName;
    }

    public void setDetailErrorName(String detailErrorName) {
        this.detailErrorName = detailErrorName;
    }

    public Long getCurrentCompProcessId() {
        return currentCompProcessId;
    }

    public void setCurrentCompProcessId(Long currentCompProcessId) {
        this.currentCompProcessId = currentCompProcessId;
    }

    public String getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(String timeReceived) {
        this.timeReceived = timeReceived;
    }

    @Override
    public Long getTemporaryClose() {
        return temporaryClose;
    }

    @Override
    public void setTemporaryClose(Long temporaryClose) {
        this.temporaryClose = temporaryClose;
    }

    @Override
    public String getCompGroupName() {
        return compGroupName;
    }

    @Override
    public void setCompGroupName(String compGroupName) {
        this.compGroupName = compGroupName;
    }

    @Override
    public String getCompTypeName() {
        return compTypeName;
    }

    @Override
    public void setCompTypeName(String compTypeName) {
        this.compTypeName = compTypeName;
    }

    public Long getCompGroupId() {
        return compGroupId;
    }

    public void setCompGroupId(Long compGroupId) {
        this.compGroupId = compGroupId;
    }

    public String getRespondTypeName() {
        return respondTypeName;
    }

    public void setRespondTypeName(String respondTypeName) {
        this.respondTypeName = respondTypeName;
    }

    public String getAcceptTypeName() {
        return acceptTypeName;
    }

    public void setAcceptTypeName(String acceptTypeName) {
        this.acceptTypeName = acceptTypeName;
    }

    public String getAcceptSourceName() {
        return acceptSourceName;
    }

    public void setAcceptSourceName(String acceptSourceName) {
        this.acceptSourceName = acceptSourceName;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public Long getTempId() {
        return tempId;
    }

    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String getStatusName() {
        return statusName;
    }

    @Override
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String getGroupId() {
        return groupId;
    }

    @Override
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDupCompNumber() {
        return dupCompNumber;
    }

    public void setDupCompNumber(String dupCompNumber) {
        this.dupCompNumber = dupCompNumber;
    }

    public String getCompFeedbackTypeName() {
        return compFeedbackTypeName;
    }

    public void setCompFeedbackTypeName(String compFeedbackTypeName) {
        this.compFeedbackTypeName = compFeedbackTypeName;
    }

    public String getDupNo() {
        return dupNo;
    }

    public void setDupNo(String dupNo) {
        this.dupNo = dupNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserGr() {
        return userGr;
    }

    public void setUserGr(String userGr) {
        this.userGr = userGr;
    }

    public String getContentCmtInput() {
        return contentCmtInput;
    }

    public void setContentCmtInput(String contentCmtInput) {
        this.contentCmtInput = contentCmtInput;
    }

    public String getContentCmtGr() {
        return contentCmtGr;
    }

    public void setContentCmtGr(String contentCmtGr) {
        this.contentCmtGr = contentCmtGr;
    }

    public String getResultContentPreProcess() {
        return resultContentPreProcess;
    }

    public void setResultContentPreProcess(String resultContentPreProcess) {
        this.resultContentPreProcess = resultContentPreProcess;
    }

    public String getResultContentProcess() {
        return resultContentProcess;
    }

    public void setResultContentProcess(String resultContentProcess) {
        this.resultContentProcess = resultContentProcess;
    }

    public String getResultContentCallback() {
        return resultContentCallback;
    }

    public void setResultContentCallback(String resultContentCallback) {
        this.resultContentCallback = resultContentCallback;
    }

    @Override
    public Long getStt() {
        return stt;
    }

    @Override
    public void setStt(Long stt) {
        this.stt = stt;
    }

    public String getCurrentStepName() {
        return currentStepName;
    }

    public void setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getComplainIdDepId() {
        return complainIdDepId;
    }

    public void setComplainIdDepId(String complainIdDepId) {
        this.complainIdDepId = complainIdDepId;
    }

    public String getInfoPro() {
        return infoPro;
    }

    public void setInfoPro(String infoPro) {
        this.infoPro = infoPro;
    }

    @Override
    public String getAcceptUser() {
        return acceptUser;
    }

    @Override
    public void setAcceptUser(String acceptUser) {
        this.acceptUser = acceptUser;
    }

    public String getUnitRequest() {
        return unitRequest;
    }

    public void setUnitRequest(String unitRequest) {
        this.unitRequest = unitRequest;
    }

    public String getPoliceOfficeName() {
        return policeOfficeName;
    }

    public void setPoliceOfficeName(String policeOfficeName) {
        this.policeOfficeName = policeOfficeName;
    }

    @Override
    public String getIsValid() {
        return isValid;
    }

    @Override
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Long getDepIdProcess() {
        return depIdProcess;
    }

    public void setDepIdProcess(Long depIdProcess) {
        this.depIdProcess = depIdProcess;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public List<TemplateComTemp> getListTempContent() {
        return listTempContent;
    }

    public void setListTempContent(List<TemplateComTemp> listTempContent) {
        this.listTempContent = listTempContent;
    }

    public List<Complain> getListComplain() {
        return listComplain;
    }

    public void setListComplain(List<Complain> listComplain) {
        this.listComplain = listComplain;
    }

    public List<InputFBDTO> getListInputFBDTO() {
        return listInputFBDTO;
    }

    public void setListInputFBDTO(List<InputFBDTO> listInputFBDTO) {
        this.listInputFBDTO = listInputFBDTO;
    }

    public Long getListComplainCount() {
        return listComplainCount;
    }

    public void setListComplainCount(Long listComplainCount) {
        this.listComplainCount = listComplainCount;
    }

    public Long getListComplainCountAccept() {
        return listComplainCountAccept;
    }

    public void setListComplainCountAccept(Long listComplainCountAccept) {
        this.listComplainCountAccept = listComplainCountAccept;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getCenter() {
        return center;
    }

    public void setCenter(Long center) {
        this.center = center;
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

    public FileUploadDTO getAttachment() {
        return attachment;
    }

    public void setAttachment(FileUploadDTO attachment) {
        this.attachment = attachment;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, String> getTemplate() {
        return template;
    }

    public void setTemplate(Map<String, String> template) {
        this.template = template;
    }

    public String getInfoProcess() {
        return infoProcess;
    }

    public void setInfoProcess(String infoProcess) {
        this.infoProcess = infoProcess;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getLstIsdn() {
        return lstIsdn;
    }

    public void setLstIsdn(String lstIsdn) {
        this.lstIsdn = lstIsdn;
    }

    public String getPoliceUnitName() {
        return policeUnitName;
    }

    public void setPoliceUnitName(String policeUnitName) {
        this.policeUnitName = policeUnitName;
    }

    public String getInfoProviderResult() {
        return infoProviderResult;
    }

    public void setInfoProviderResult(String infoProviderResult) {
        this.infoProviderResult = infoProviderResult;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUnitReceipt() {
        return unitReceipt;
    }

    public void setUnitReceipt(String unitReceipt) {
        this.unitReceipt = unitReceipt;
    }

    public String getContentSms() {
        return contentSms;
    }

    public void setContentSms(String contentSms) {
        this.contentSms = contentSms;
    }

    public String getInputInfor() {
        return inputInfor;
    }

    public void setInputInfor(String inputInfor) {
        this.inputInfor = inputInfor;
    }

    public String getSms5h() {
        return sms5h;
    }

    public void setSms5h(String sms5h) {
        this.sms5h = sms5h;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public String getVipGif() {
        return vipGif;
    }

    public void setVipGif(String vipGif) {
        this.vipGif = vipGif;
    }

    @Override
    public List<String> getLstStatus() {
        return lstStatus;
    }

    @Override
    public void setLstStatus(List<String> lstStatus) {
        this.lstStatus = lstStatus;
    }

    public List<Long> getLsDepId() {
        return lsDepId;
    }

    public void setLsDepId(List<Long> lsDepId) {
        this.lsDepId = lsDepId;
    }
}
