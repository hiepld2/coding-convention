package problem.code.convention.dependency;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Complain implements Serializable {

    public Complain() {
    }

    private Long complainId;

    private String isdn;

    private Long subId;

    private String subType;

    private Long compTypeId;

    private String compContent;

    private String complainer;

    private String phone;

    private String address;

    private String acceptUser;

    private Date acceptDate;

    private Long acceptTypeId;

    private Date limitDate;

    private String endUser;

    private Date endDate;

    private String valid;

    private Long reasonId;

    private Long resultId;

    private Long satisfiedLevel;

    private String preResult;

    private String resultContent;

    private String status;

    private String disAmount;

    private String description;

    private String priority;

    private String province;

    private String provinceName;

    private String districtName;

    private String wardName;

    private Long imProcess;

    private Long scratchChange;

    private String otherComplainer;

    private Long acceptSourceId;

    private Long complainLevel;

    private String actionId;

    private Long respondType;

    private String submit;

    private Long relGroupId;

    private String complainNumByYear;

    private Long careAmount;

    private String solutionDescription;

    private Long compensAmount;

    private Long scratchValues;

    private String type;

    private String cenCode;

    private String cenCodeUser;

    private String idNo;

    private Long numofcom;

    private Date cancelDate;

    private String cancel;

    private String callBackRequire;

    private String complainType;

    private Long depId;

    private Long ticketId;

    private String callBackUser;

    private Long callBackDepId;

    private Date callBackDate;

    private String processUser;

    private Date processDate;

    private Date feedbackDate;

    private String expiry;

    private String profile;

    private String networkIssue;

    private String vip;

    private String payMethod;

    private String callBackContent;

    private Long compTypeErrorId;

    private String payAreaCode;

    private Long custType;

    private Long compFeedbackTypeId;

    private String urgent;

    private String resultContentFb;

    private String employeeName;

    private String employeeMobile;

    private String payType;

    private Long compErrorId;

    private Long detailErrorId;

    private String compCenCode;

    private String contentReflect;

    private String verifyError;

    private String confirmAmount;

    private String adjustAmount;

    private String adjustDateNumber;

    private String accountType;

    private String adjustType;

    private String adjustService;

    private String numberApprove;

    private Long statusImportBilling;

    private String causeErrNoc;

    private String causeErrDelNoc;

    private String serviceType;

    private Long fbToKn;

    private Long temporaryClose;

    private String errorMessage;

    private Long sourceDuppId;

    private Long blackPoint;

    private String customerType;

    private Date preProcessDate;

    private String currentStep;

    private String preProcessUser;

    private Long shop;

    private String docNo;

    private Long policeOffice;

    private String note;

    private String title;

    private String emailRequest;

    private String smsRequest;

    private Long currentDepId;

    private String currentUsername;

    private String compGroupName;

    private String compTypeName;

    private String departmentName;

    private String dateList;

    private String statue;

    private String callBackComment;

    private String groupId;

    private Date fromDate;

    private Date toDate;

    private String inputComment;

    private String userName;

    private String inputEvaluate;

    private String processComment;

    private String preProcess;

    private String coopCorrect;

    private String identityReason;

    private String process;

    private String processAuditResult;

    private String notifyCustomer;

    private Long careTypeId;

    private Long compEvaluateId;

    private String callBackkEvaluate;

    private Long careValues;

    private Long careTotalsValues;

    private Long causeErrorId;

    private String inputUserEva;

    private String callBackUserEva;

    private String typeCheck;

    private String processDepName;

    private String processDepId;

    private String caName;

    private String addressReceiveResults;

    private Long stt;

    private String statusName;

    private String cusName;

    private String notiIsdn;

    private String notiProDate;

    private String notiContent;

    private String userDep;

    private Long notificationId;

    private String notiStep;

    private String preProResult;

    private String proResult;

    private String callBackResult;

    private String isValid;

    private String isDistribution;

    private String infoGr;

    private String contentPA;

//    public Complain(InputFBDTO input) {
//        super();
//        isdn = input.getIsdn();
//        subId = input.getSubId();
//        subType = input.getSubType();
//        customerType = input.getCustomerType();
//        address = input.getAddress();
//        idNo = input.getIdNo();
//
//        complainId = input.getComplainId();
//        compTypeId = input.getCompTypeId();
//        compContent = input.getCompContent();
//        acceptUser = input.getAcceptUser();
//        acceptDate = StringUtil.stringIsNullOrEmty(input.getAcceptDate()) ? new Date() : input.getAcceptDate();
//        province = StringUtil.nvl(input.getPrecinct(), StringUtil.nvl(input.getDistrict(), input.getProvince()));
//        cenCode = input.getCenCode();
//        cenCodeUser = input.getCenCodeUser();
//        callBackRequire = input.getCallBackRequire();
//        complainType = input.getComplainType();
//        status = input.getStatus();
//        imProcess = input.getImProcess();
//        phone = input.getPhone();
//        networkIssue = input.getNetworkIssue();
//        vip = input.getVip();
//        payMethod = input.getPayMethod();
//        acceptTypeId = input.getAcceptTypeId();
//        acceptSourceId = input.getAcceptSourceId();
//        payAreaCode = input.getPayAreaCode();
//        custType = input.getCustType();
//        type = input.getNetworkType();
//        limitDate = input.getLimitDate();
//        urgent = input.getUrgent();
//        complainer = input.getComplainer();
//        payType = input.getPayType();
//        compCenCode = input.getCompCenCode();
//        detailErrorId = input.getDetailErrorId();
//        imProcess = 1L;
//        feedbackDate = input.getFeedbackDate();
//        compFeedbackTypeId = input.getCompFeedbackTypeId();
//        cancel = input.getCancel();
//        sourceDuppId = input.getSourceDuppId();
//        shop = input.getShop();
//        groupId = input.getGroupId();
//        docNo = input.getDocNo();
//        policeOffice = input.getPoliceOffice();
//        note = input.getNote();
//        fbToKn = input.getFbToKn();
//        serviceType = input.getServiceType();
//        depId = input.getDepId();
//        temporaryClose = input.isCloseNow() ? 2L : null;
//
//        causeErrorId = input.getCauseErrorId();
//
//        preResult = input.getPreResult();
//    }

    private List<CompTemplateContent> templates;

    private List<String> lstStatus;

    private String slaStatus;

    private String pakhServiceType;

    private List<Map<String, Object>> templatesForNOC;

    public Complain(InputFBDTO input) {
    }

    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
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

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
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

    public String getComplainer() {
        return complainer;
    }

    public void setComplainer(String complainer) {
        this.complainer = complainer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(String acceptUser) {
        this.acceptUser = acceptUser;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Long getAcceptTypeId() {
        return acceptTypeId;
    }

    public void setAcceptTypeId(Long acceptTypeId) {
        this.acceptTypeId = acceptTypeId;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public String getEndUser() {
        return endUser;
    }

    public void setEndUser(String endUser) {
        this.endUser = endUser;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getSatisfiedLevel() {
        return satisfiedLevel;
    }

    public void setSatisfiedLevel(Long satisfiedLevel) {
        this.satisfiedLevel = satisfiedLevel;
    }

    public String getPreResult() {
        return preResult;
    }

    public void setPreResult(String preResult) {
        this.preResult = preResult;
    }

    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisAmount() {
        return disAmount;
    }

    public void setDisAmount(String disAmount) {
        this.disAmount = disAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public Long getImProcess() {
        return imProcess;
    }

    public void setImProcess(Long imProcess) {
        this.imProcess = imProcess;
    }

    public Long getScratchChange() {
        return scratchChange;
    }

    public void setScratchChange(Long scratchChange) {
        this.scratchChange = scratchChange;
    }

    public String getOtherComplainer() {
        return otherComplainer;
    }

    public void setOtherComplainer(String otherComplainer) {
        this.otherComplainer = otherComplainer;
    }

    public Long getAcceptSourceId() {
        return acceptSourceId;
    }

    public void setAcceptSourceId(Long acceptSourceId) {
        this.acceptSourceId = acceptSourceId;
    }

    public Long getComplainLevel() {
        return complainLevel;
    }

    public void setComplainLevel(Long complainLevel) {
        this.complainLevel = complainLevel;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public Long getRespondType() {
        return respondType;
    }

    public void setRespondType(Long respondType) {
        this.respondType = respondType;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public Long getRelGroupId() {
        return relGroupId;
    }

    public void setRelGroupId(Long relGroupId) {
        this.relGroupId = relGroupId;
    }

    public String getComplainNumByYear() {
        return complainNumByYear;
    }

    public void setComplainNumByYear(String complainNumByYear) {
        this.complainNumByYear = complainNumByYear;
    }

    public Long getCareAmount() {
        return careAmount;
    }

    public void setCareAmount(Long careAmount) {
        this.careAmount = careAmount;
    }

    public String getSolutionDescription() {
        return solutionDescription;
    }

    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }

    public Long getCompensAmount() {
        return compensAmount;
    }

    public void setCompensAmount(Long compensAmount) {
        this.compensAmount = compensAmount;
    }

    public Long getScratchValues() {
        return scratchValues;
    }

    public void setScratchValues(Long scratchValues) {
        this.scratchValues = scratchValues;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCenCode() {
        return cenCode;
    }

    public void setCenCode(String cenCode) {
        this.cenCode = cenCode;
    }

    public String getCenCodeUser() {
        return cenCodeUser;
    }

    public void setCenCodeUser(String cenCodeUser) {
        this.cenCodeUser = cenCodeUser;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Long getNumofcom() {
        return numofcom;
    }

    public void setNumofcom(Long numofcom) {
        this.numofcom = numofcom;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getCallBackRequire() {
        return callBackRequire;
    }

    public void setCallBackRequire(String callBackRequire) {
        this.callBackRequire = callBackRequire;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getCallBackUser() {
        return callBackUser;
    }

    public void setCallBackUser(String callBackUser) {
        this.callBackUser = callBackUser;
    }

    public Long getCallBackDepId() {
        return callBackDepId;
    }

    public void setCallBackDepId(Long callBackDepId) {
        this.callBackDepId = callBackDepId;
    }

    public Date getCallBackDate() {
        return callBackDate;
    }

    public void setCallBackDate(Date callBackDate) {
        this.callBackDate = callBackDate;
    }

    public String getProcessUser() {
        return processUser;
    }

    public void setProcessUser(String processUser) {
        this.processUser = processUser;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNetworkIssue() {
        return networkIssue;
    }

    public void setNetworkIssue(String networkIssue) {
        this.networkIssue = networkIssue;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCallBackContent() {
        return callBackContent;
    }

    public void setCallBackContent(String callBackContent) {
        this.callBackContent = callBackContent;
    }

    public Long getCompTypeErrorId() {
        return compTypeErrorId;
    }

    public void setCompTypeErrorId(Long compTypeErrorId) {
        this.compTypeErrorId = compTypeErrorId;
    }

    public String getPayAreaCode() {
        return payAreaCode;
    }

    public void setPayAreaCode(String payAreaCode) {
        this.payAreaCode = payAreaCode;
    }

    public Long getCustType() {
        return custType;
    }

    public void setCustType(Long custType) {
        this.custType = custType;
    }

    public Long getCompFeedbackTypeId() {
        return compFeedbackTypeId;
    }

    public void setCompFeedbackTypeId(Long compFeedbackTypeId) {
        this.compFeedbackTypeId = compFeedbackTypeId;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getResultContentFb() {
        return resultContentFb;
    }

    public void setResultContentFb(String resultContentFb) {
        this.resultContentFb = resultContentFb;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Long getCompErrorId() {
        return compErrorId;
    }

    public void setCompErrorId(Long compErrorId) {
        this.compErrorId = compErrorId;
    }

    public Long getDetailErrorId() {
        return detailErrorId;
    }

    public void setDetailErrorId(Long detailErrorId) {
        this.detailErrorId = detailErrorId;
    }

    public String getCompCenCode() {
        return compCenCode;
    }

    public void setCompCenCode(String compCenCode) {
        this.compCenCode = compCenCode;
    }

    public String getContentReflect() {
        return contentReflect;
    }

    public void setContentReflect(String contentReflect) {
        this.contentReflect = contentReflect;
    }

    public String getVerifyError() {
        return verifyError;
    }

    public void setVerifyError(String verifyError) {
        this.verifyError = verifyError;
    }

    public String getConfirmAmount() {
        return confirmAmount;
    }

    public void setConfirmAmount(String confirmAmount) {
        this.confirmAmount = confirmAmount;
    }

    public String getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(String adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public String getAdjustDateNumber() {
        return adjustDateNumber;
    }

    public void setAdjustDateNumber(String adjustDateNumber) {
        this.adjustDateNumber = adjustDateNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType;
    }

    public String getAdjustService() {
        return adjustService;
    }

    public void setAdjustService(String adjustService) {
        this.adjustService = adjustService;
    }

    public String getNumberApprove() {
        return numberApprove;
    }

    public void setNumberApprove(String numberApprove) {
        this.numberApprove = numberApprove;
    }

    public Long getStatusImportBilling() {
        return statusImportBilling;
    }

    public void setStatusImportBilling(Long statusImportBilling) {
        this.statusImportBilling = statusImportBilling;
    }

    public String getCauseErrNoc() {
        return causeErrNoc;
    }

    public void setCauseErrNoc(String causeErrNoc) {
        this.causeErrNoc = causeErrNoc;
    }

    public String getCauseErrDelNoc() {
        return causeErrDelNoc;
    }

    public void setCauseErrDelNoc(String causeErrDelNoc) {
        this.causeErrDelNoc = causeErrDelNoc;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Long getFbToKn() {
        return fbToKn;
    }

    public void setFbToKn(Long fbToKn) {
        this.fbToKn = fbToKn;
    }

    public Long getTemporaryClose() {
        return temporaryClose;
    }

    public void setTemporaryClose(Long temporaryClose) {
        this.temporaryClose = temporaryClose;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getSourceDuppId() {
        return sourceDuppId;
    }

    public void setSourceDuppId(Long sourceDuppId) {
        this.sourceDuppId = sourceDuppId;
    }

    public Long getBlackPoint() {
        return blackPoint;
    }

    public void setBlackPoint(Long blackPoint) {
        this.blackPoint = blackPoint;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Date getPreProcessDate() {
        return preProcessDate;
    }

    public void setPreProcessDate(Date preProcessDate) {
        this.preProcessDate = preProcessDate;
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public String getPreProcessUser() {
        return preProcessUser;
    }

    public void setPreProcessUser(String preProcessUser) {
        this.preProcessUser = preProcessUser;
    }

    public Long getShop() {
        return shop;
    }

    public void setShop(Long shop) {
        this.shop = shop;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmailRequest() {
        return emailRequest;
    }

    public void setEmailRequest(String emailRequest) {
        this.emailRequest = emailRequest;
    }

    public String getSmsRequest() {
        return smsRequest;
    }

    public void setSmsRequest(String smsRequest) {
        this.smsRequest = smsRequest;
    }

    public Long getCurrentDepId() {
        return currentDepId;
    }

    public void setCurrentDepId(Long currentDepId) {
        this.currentDepId = currentDepId;
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    public String getCompGroupName() {
        return compGroupName;
    }

    public void setCompGroupName(String compGroupName) {
        this.compGroupName = compGroupName;
    }

    public String getCompTypeName() {
        return compTypeName;
    }

    public void setCompTypeName(String compTypeName) {
        this.compTypeName = compTypeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getCallBackComment() {
        return callBackComment;
    }

    public void setCallBackComment(String callBackComment) {
        this.callBackComment = callBackComment;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getInputComment() {
        return inputComment;
    }

    public void setInputComment(String inputComment) {
        this.inputComment = inputComment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInputEvaluate() {
        return inputEvaluate;
    }

    public void setInputEvaluate(String inputEvaluate) {
        this.inputEvaluate = inputEvaluate;
    }

    public String getProcessComment() {
        return processComment;
    }

    public void setProcessComment(String processComment) {
        this.processComment = processComment;
    }

    public String getPreProcess() {
        return preProcess;
    }

    public void setPreProcess(String preProcess) {
        this.preProcess = preProcess;
    }

    public String getCoopCorrect() {
        return coopCorrect;
    }

    public void setCoopCorrect(String coopCorrect) {
        this.coopCorrect = coopCorrect;
    }

    public String getIdentityReason() {
        return identityReason;
    }

    public void setIdentityReason(String identityReason) {
        this.identityReason = identityReason;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getProcessAuditResult() {
        return processAuditResult;
    }

    public void setProcessAuditResult(String processAuditResult) {
        this.processAuditResult = processAuditResult;
    }

    public String getNotifyCustomer() {
        return notifyCustomer;
    }

    public void setNotifyCustomer(String notifyCustomer) {
        this.notifyCustomer = notifyCustomer;
    }

    public Long getCareTypeId() {
        return careTypeId;
    }

    public void setCareTypeId(Long careTypeId) {
        this.careTypeId = careTypeId;
    }

    public Long getCompEvaluateId() {
        return compEvaluateId;
    }

    public void setCompEvaluateId(Long compEvaluateId) {
        this.compEvaluateId = compEvaluateId;
    }

    public String getCallBackkEvaluate() {
        return callBackkEvaluate;
    }

    public void setCallBackkEvaluate(String callBackkEvaluate) {
        this.callBackkEvaluate = callBackkEvaluate;
    }

    public Long getCareValues() {
        return careValues;
    }

    public void setCareValues(Long careValues) {
        this.careValues = careValues;
    }

    public Long getCareTotalsValues() {
        return careTotalsValues;
    }

    public void setCareTotalsValues(Long careTotalsValues) {
        this.careTotalsValues = careTotalsValues;
    }

    public Long getCauseErrorId() {
        return causeErrorId;
    }

    public void setCauseErrorId(Long causeErrorId) {
        this.causeErrorId = causeErrorId;
    }

    public String getInputUserEva() {
        return inputUserEva;
    }

    public void setInputUserEva(String inputUserEva) {
        this.inputUserEva = inputUserEva;
    }

    public String getCallBackUserEva() {
        return callBackUserEva;
    }

    public void setCallBackUserEva(String callBackUserEva) {
        this.callBackUserEva = callBackUserEva;
    }

    public String getTypeCheck() {
        return typeCheck;
    }

    public void setTypeCheck(String typeCheck) {
        this.typeCheck = typeCheck;
    }

    public String getProcessDepName() {
        return processDepName;
    }

    public void setProcessDepName(String processDepName) {
        this.processDepName = processDepName;
    }

    public String getProcessDepId() {
        return processDepId;
    }

    public void setProcessDepId(String processDepId) {
        this.processDepId = processDepId;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public String getAddressReceiveResults() {
        return addressReceiveResults;
    }

    public void setAddressReceiveResults(String addressReceiveResults) {
        this.addressReceiveResults = addressReceiveResults;
    }

    public Long getStt() {
        return stt;
    }

    public void setStt(Long stt) {
        this.stt = stt;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getNotiIsdn() {
        return notiIsdn;
    }

    public void setNotiIsdn(String notiIsdn) {
        this.notiIsdn = notiIsdn;
    }

    public String getNotiProDate() {
        return notiProDate;
    }

    public void setNotiProDate(String notiProDate) {
        this.notiProDate = notiProDate;
    }

    public String getNotiContent() {
        return notiContent;
    }

    public void setNotiContent(String notiContent) {
        this.notiContent = notiContent;
    }

    public String getUserDep() {
        return userDep;
    }

    public void setUserDep(String userDep) {
        this.userDep = userDep;
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotiStep() {
        return notiStep;
    }

    public void setNotiStep(String notiStep) {
        this.notiStep = notiStep;
    }

    public String getPreProResult() {
        return preProResult;
    }

    public void setPreProResult(String preProResult) {
        this.preProResult = preProResult;
    }

    public String getProResult() {
        return proResult;
    }

    public void setProResult(String proResult) {
        this.proResult = proResult;
    }

    public String getCallBackResult() {
        return callBackResult;
    }

    public void setCallBackResult(String callBackResult) {
        this.callBackResult = callBackResult;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getIsDistribution() {
        return isDistribution;
    }

    public void setIsDistribution(String isDistribution) {
        this.isDistribution = isDistribution;
    }

    public String getInfoGr() {
        return infoGr;
    }

    public void setInfoGr(String infoGr) {
        this.infoGr = infoGr;
    }

    public String getContentPA() {
        return contentPA;
    }

    public void setContentPA(String contentPA) {
        this.contentPA = contentPA;
    }

    public List<CompTemplateContent> getTemplates() {
        return templates;
    }

    public void setTemplates(List<CompTemplateContent> templates) {
        this.templates = templates;
    }

    public List<String> getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(List<String> lstStatus) {
        this.lstStatus = lstStatus;
    }

    public String getSlaStatus() {
        return slaStatus;
    }

    public void setSlaStatus(String slaStatus) {
        this.slaStatus = slaStatus;
    }

    public String getPakhServiceType() {
        return pakhServiceType;
    }

    public void setPakhServiceType(String pakhServiceType) {
        this.pakhServiceType = pakhServiceType;
    }

    public List<Map<String, Object>> getTemplatesForNOC() {
        return templatesForNOC;
    }

    public void setTemplatesForNOC(List<Map<String, Object>> templatesForNOC) {
        this.templatesForNOC = templatesForNOC;
    }
}

