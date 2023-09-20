package problem.code.convention.dependency;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CompProcess implements Serializable {

    private Long compProId;

    private Long complainId;

    private Long depId;

    private String username;


    private Date fwDate;


    private Date proDate;

    private Date limitDate;

    private String resultContent;

    private String status;

    private String description;

    private String memo;

    private String actionCode;

    private String changeUser;

    private Date changeDate;

    private String step;

    private Long responseType;
    private String contactStatus;

    private String reason;

    private String inputRating;

    private String processRating;

    private String callbackContent;

    private String serviceError;

    private Date serviceErrorDate;

    private String serviceSolutions;

    private String adjustmentContent;

    private String adjustedReason;

    private Long adjustmentMoney;

    private Long adjustmentDateNumber;

    private String adjustmentType;

    private String accountType;

    private String compTypeErrorDetails;

    private String compTypeErrorId;

    private String compTypeErrorIdLv1;

    private String compTypeErrorIdLv2;

    private Long processLevel;

    private Long parentId;

    private Date returnDate;

    private String resultRecipient;

    private String ems;

    private String personReturnResult;
    private String isdnReturnResult;

    private String addressReceiveResults;

    private String province;

    private String district;

    private String ward;

    private String caName;

    private String phone;

    private String email;

    private String profileStatus;
    private String adjustmentConfirm;

    private String contentSupport;

    private String buCuoc;

    private Long reopen;

    private String violationEmployee;

    private Long department;

    private String infoProviderResult;

    private String depName;

    private String fwDate2;

    private String proDateStr;

    private String changeDateStr;


    private String estimatedFinishTime;
    private String answerDate;
    private Long returnReceiveChecked;
    private Long blackPointChecked;

    private Long feeAdjustmentChecked;

    private Long requestTemporaryCloseChecked;

    private Long temporaryClose ;
    private Long transferComplainChecked;

    private Long valid;
    private Long careType;


    private Long careTotalsValues;


    private Long careValues;


    private Long changeAppointmentDate;



    private String serviceErrorDateStr;


    private String limitDateStr;


    private String responseTypeName;


    private String listEmailAddress;


    private String contentEmail;


    private String subjectEmail;


    private String adjustmentContentName;


    private Boolean checkCallOut;




    private Complain complain;


    private String level;

    public CompProcess() {
    }

    public CompProcess(Complain complain) {
        super();
        setComplainId(complain.getComplainId());
        setFwDate(complain.getAcceptDate());
        setProDate(complain.getAcceptDate());
        setLimitDate(complain.getLimitDate());
        setStatus(cpStatus.INIT.status);
        setComplain(complain);
    }

    public enum cpStatus {
        INIT("0"), FINISH("1"), CANCEL("9");

        private final String status;

        cpStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }

    public enum STEP {
        TXL("1"), XL("2"), GR("3");

        private final String step;

        STEP(String step) {
            this.step = step;
        }

        public String getStep() {
            return step;
        }
    }


    private Integer closeNow;


    private String fileName;

    private String filePath;


    private Long callOutStepId;

    private String resultContentGR;


    private String resultContentXL;

//
//    private String compTypeErrorId;


    private String complainType;


    private String compTypeErrorName;


    private String compTypeErrorNameLv1;


    private String compTypeErrorNameLv2;


    private String contentSms;


    private List<Long> depIdOfTCTK;


    private String processRatingName;


    String departmentName;

    public Long getCompProId() {
        return compProId;
    }

    public void setCompProId(Long compProId) {
        this.compProId = compProId;
    }

    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFwDate() {
        return fwDate;
    }

    public void setFwDate(Date fwDate) {
        this.fwDate = fwDate;
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getChangeUser() {
        return changeUser;
    }

    public void setChangeUser(String changeUser) {
        this.changeUser = changeUser;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public Long getResponseType() {
        return responseType;
    }

    public void setResponseType(Long responseType) {
        this.responseType = responseType;
    }

    public String getContactStatus() {
        return contactStatus;
    }

    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getInputRating() {
        return inputRating;
    }

    public void setInputRating(String inputRating) {
        this.inputRating = inputRating;
    }

    public String getProcessRating() {
        return processRating;
    }

    public void setProcessRating(String processRating) {
        this.processRating = processRating;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public String getServiceError() {
        return serviceError;
    }

    public void setServiceError(String serviceError) {
        this.serviceError = serviceError;
    }

    public Date getServiceErrorDate() {
        return serviceErrorDate;
    }

    public void setServiceErrorDate(Date serviceErrorDate) {
        this.serviceErrorDate = serviceErrorDate;
    }

    public String getServiceSolutions() {
        return serviceSolutions;
    }

    public void setServiceSolutions(String serviceSolutions) {
        this.serviceSolutions = serviceSolutions;
    }

    public String getAdjustmentContent() {
        return adjustmentContent;
    }

    public void setAdjustmentContent(String adjustmentContent) {
        this.adjustmentContent = adjustmentContent;
    }

    public String getAdjustedReason() {
        return adjustedReason;
    }

    public void setAdjustedReason(String adjustedReason) {
        this.adjustedReason = adjustedReason;
    }

    public Long getAdjustmentMoney() {
        return adjustmentMoney;
    }

    public void setAdjustmentMoney(Long adjustmentMoney) {
        this.adjustmentMoney = adjustmentMoney;
    }

    public Long getAdjustmentDateNumber() {
        return adjustmentDateNumber;
    }

    public void setAdjustmentDateNumber(Long adjustmentDateNumber) {
        this.adjustmentDateNumber = adjustmentDateNumber;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCompTypeErrorDetails() {
        return compTypeErrorDetails;
    }

    public void setCompTypeErrorDetails(String compTypeErrorDetails) {
        this.compTypeErrorDetails = compTypeErrorDetails;
    }

    public String getCompTypeErrorId() {
        return compTypeErrorId;
    }

    public void setCompTypeErrorId(String compTypeErrorId) {
        this.compTypeErrorId = compTypeErrorId;
    }

    public String getCompTypeErrorIdLv1() {
        return compTypeErrorIdLv1;
    }

    public void setCompTypeErrorIdLv1(String compTypeErrorIdLv1) {
        this.compTypeErrorIdLv1 = compTypeErrorIdLv1;
    }

    public String getCompTypeErrorIdLv2() {
        return compTypeErrorIdLv2;
    }

    public void setCompTypeErrorIdLv2(String compTypeErrorIdLv2) {
        this.compTypeErrorIdLv2 = compTypeErrorIdLv2;
    }

    public Long getProcessLevel() {
        return processLevel;
    }

    public void setProcessLevel(Long processLevel) {
        this.processLevel = processLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getResultRecipient() {
        return resultRecipient;
    }

    public void setResultRecipient(String resultRecipient) {
        this.resultRecipient = resultRecipient;
    }

    public String getEms() {
        return ems;
    }

    public void setEms(String ems) {
        this.ems = ems;
    }

    public String getPersonReturnResult() {
        return personReturnResult;
    }

    public void setPersonReturnResult(String personReturnResult) {
        this.personReturnResult = personReturnResult;
    }

    public String getIsdnReturnResult() {
        return isdnReturnResult;
    }

    public void setIsdnReturnResult(String isdnReturnResult) {
        this.isdnReturnResult = isdnReturnResult;
    }

    public String getAddressReceiveResults() {
        return addressReceiveResults;
    }

    public void setAddressReceiveResults(String addressReceiveResults) {
        this.addressReceiveResults = addressReceiveResults;
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

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public String getAdjustmentConfirm() {
        return adjustmentConfirm;
    }

    public void setAdjustmentConfirm(String adjustmentConfirm) {
        this.adjustmentConfirm = adjustmentConfirm;
    }

    public String getContentSupport() {
        return contentSupport;
    }

    public void setContentSupport(String contentSupport) {
        this.contentSupport = contentSupport;
    }

    public String getBuCuoc() {
        return buCuoc;
    }

    public void setBuCuoc(String buCuoc) {
        this.buCuoc = buCuoc;
    }

    public Long getReopen() {
        return reopen;
    }

    public void setReopen(Long reopen) {
        this.reopen = reopen;
    }

    public String getViolationEmployee() {
        return violationEmployee;
    }

    public void setViolationEmployee(String violationEmployee) {
        this.violationEmployee = violationEmployee;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public String getInfoProviderResult() {
        return infoProviderResult;
    }

    public void setInfoProviderResult(String infoProviderResult) {
        this.infoProviderResult = infoProviderResult;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getFwDate2() {
        return fwDate2;
    }

    public void setFwDate2(String fwDate2) {
        this.fwDate2 = fwDate2;
    }

    public String getProDateStr() {
        return proDateStr;
    }

    public void setProDateStr(String proDateStr) {
        this.proDateStr = proDateStr;
    }

    public String getChangeDateStr() {
        return changeDateStr;
    }

    public void setChangeDateStr(String changeDateStr) {
        this.changeDateStr = changeDateStr;
    }

    public String getEstimatedFinishTime() {
        return estimatedFinishTime;
    }

    public void setEstimatedFinishTime(String estimatedFinishTime) {
        this.estimatedFinishTime = estimatedFinishTime;
    }

    public String getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }

    public Long getReturnReceiveChecked() {
        return returnReceiveChecked;
    }

    public void setReturnReceiveChecked(Long returnReceiveChecked) {
        this.returnReceiveChecked = returnReceiveChecked;
    }

    public Long getBlackPointChecked() {
        return blackPointChecked;
    }

    public void setBlackPointChecked(Long blackPointChecked) {
        this.blackPointChecked = blackPointChecked;
    }

    public Long getFeeAdjustmentChecked() {
        return feeAdjustmentChecked;
    }

    public void setFeeAdjustmentChecked(Long feeAdjustmentChecked) {
        this.feeAdjustmentChecked = feeAdjustmentChecked;
    }

    public Long getRequestTemporaryCloseChecked() {
        return requestTemporaryCloseChecked;
    }

    public void setRequestTemporaryCloseChecked(Long requestTemporaryCloseChecked) {
        this.requestTemporaryCloseChecked = requestTemporaryCloseChecked;
    }

    public Long getTemporaryClose() {
        return temporaryClose;
    }

    public void setTemporaryClose(Long temporaryClose) {
        this.temporaryClose = temporaryClose;
    }

    public Long getTransferComplainChecked() {
        return transferComplainChecked;
    }

    public void setTransferComplainChecked(Long transferComplainChecked) {
        this.transferComplainChecked = transferComplainChecked;
    }

    public Long getValid() {
        return valid;
    }

    public void setValid(Long valid) {
        this.valid = valid;
    }

    public Long getCareType() {
        return careType;
    }

    public void setCareType(Long careType) {
        this.careType = careType;
    }

    public Long getCareTotalsValues() {
        return careTotalsValues;
    }

    public void setCareTotalsValues(Long careTotalsValues) {
        this.careTotalsValues = careTotalsValues;
    }

    public Long getCareValues() {
        return careValues;
    }

    public void setCareValues(Long careValues) {
        this.careValues = careValues;
    }

    public Long getChangeAppointmentDate() {
        return changeAppointmentDate;
    }

    public void setChangeAppointmentDate(Long changeAppointmentDate) {
        this.changeAppointmentDate = changeAppointmentDate;
    }

    public String getServiceErrorDateStr() {
        return serviceErrorDateStr;
    }

    public void setServiceErrorDateStr(String serviceErrorDateStr) {
        this.serviceErrorDateStr = serviceErrorDateStr;
    }

    public String getLimitDateStr() {
        return limitDateStr;
    }

    public void setLimitDateStr(String limitDateStr) {
        this.limitDateStr = limitDateStr;
    }

    public String getResponseTypeName() {
        return responseTypeName;
    }

    public void setResponseTypeName(String responseTypeName) {
        this.responseTypeName = responseTypeName;
    }

    public String getListEmailAddress() {
        return listEmailAddress;
    }

    public void setListEmailAddress(String listEmailAddress) {
        this.listEmailAddress = listEmailAddress;
    }

    public String getContentEmail() {
        return contentEmail;
    }

    public void setContentEmail(String contentEmail) {
        this.contentEmail = contentEmail;
    }

    public String getSubjectEmail() {
        return subjectEmail;
    }

    public void setSubjectEmail(String subjectEmail) {
        this.subjectEmail = subjectEmail;
    }

    public String getAdjustmentContentName() {
        return adjustmentContentName;
    }

    public void setAdjustmentContentName(String adjustmentContentName) {
        this.adjustmentContentName = adjustmentContentName;
    }

    public Boolean getCheckCallOut() {
        return checkCallOut;
    }

    public void setCheckCallOut(Boolean checkCallOut) {
        this.checkCallOut = checkCallOut;
    }

    public Complain getComplain() {
        return complain;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getCloseNow() {
        return closeNow;
    }

    public void setCloseNow(Integer closeNow) {
        this.closeNow = closeNow;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Long getCallOutStepId() {
        return callOutStepId;
    }

    public void setCallOutStepId(Long callOutStepId) {
        this.callOutStepId = callOutStepId;
    }

    public String getResultContentGR() {
        return resultContentGR;
    }

    public void setResultContentGR(String resultContentGR) {
        this.resultContentGR = resultContentGR;
    }

    public String getResultContentXL() {
        return resultContentXL;
    }

    public void setResultContentXL(String resultContentXL) {
        this.resultContentXL = resultContentXL;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public String getCompTypeErrorName() {
        return compTypeErrorName;
    }

    public void setCompTypeErrorName(String compTypeErrorName) {
        this.compTypeErrorName = compTypeErrorName;
    }

    public String getCompTypeErrorNameLv1() {
        return compTypeErrorNameLv1;
    }

    public void setCompTypeErrorNameLv1(String compTypeErrorNameLv1) {
        this.compTypeErrorNameLv1 = compTypeErrorNameLv1;
    }

    public String getCompTypeErrorNameLv2() {
        return compTypeErrorNameLv2;
    }

    public void setCompTypeErrorNameLv2(String compTypeErrorNameLv2) {
        this.compTypeErrorNameLv2 = compTypeErrorNameLv2;
    }

    public String getContentSms() {
        return contentSms;
    }

    public void setContentSms(String contentSms) {
        this.contentSms = contentSms;
    }

    public List<Long> getDepIdOfTCTK() {
        return depIdOfTCTK;
    }

    public void setDepIdOfTCTK(List<Long> depIdOfTCTK) {
        this.depIdOfTCTK = depIdOfTCTK;
    }

    public String getProcessRatingName() {
        return processRatingName;
    }

    public void setProcessRatingName(String processRatingName) {
        this.processRatingName = processRatingName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
