package problem.code.convention.dependency;


import java.io.Serializable;
import java.util.Date;

public class CompFileUpload implements Serializable {

    private Long fileId;

    private Long complainId;

    private Long folderId;

    private String fileName;

    private String isdn;

    private Long subId;

    private Integer status;

    private java.util.Date createDate;

    private java.util.Date deleteDate;
    private String userUpload;

    private String userDelete;

    private String subType;

    private String urlFileFeedback;
    private Long pakhStatus;

    private Long fileImageId;

    private Long compProcessId;

    private String additionalInfo;

    private Complain complain;


    public CompFileUpload() {
        this.status = 1;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getUserUpload() {
        return userUpload;
    }

    public void setUserUpload(String userUpload) {
        this.userUpload = userUpload;
    }

    public String getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getUrlFileFeedback() {
        return urlFileFeedback;
    }

    public void setUrlFileFeedback(String urlFileFeedback) {
        this.urlFileFeedback = urlFileFeedback;
    }

    public Long getPakhStatus() {
        return pakhStatus;
    }

    public void setPakhStatus(Long pakhStatus) {
        this.pakhStatus = pakhStatus;
    }

    public Long getFileImageId() {
        return fileImageId;
    }

    public void setFileImageId(Long fileImageId) {
        this.fileImageId = fileImageId;
    }

    public Long getCompProcessId() {
        return compProcessId;
    }

    public void setCompProcessId(Long compProcessId) {
        this.compProcessId = compProcessId;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Complain getComplain() {
        return complain;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }
}
