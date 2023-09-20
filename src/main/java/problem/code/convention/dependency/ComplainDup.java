package problem.code.convention.dependency;


import java.util.Date;


public class ComplainDup {

    private Long complainDupId;

    private Long complainId;

    private Long complainIdNew;

    private Date createDate;

    private String createUser;

    private Long dupNo;

    public Long getComplainDupId() {
        return complainDupId;
    }

    public void setComplainDupId(Long complainDupId) {
        this.complainDupId = complainDupId;
    }

    public Long getComplainId() {
        return complainId;
    }

    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    public Long getComplainIdNew() {
        return complainIdNew;
    }

    public void setComplainIdNew(Long complainIdNew) {
        this.complainIdNew = complainIdNew;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Long getDupNo() {
        return dupNo;
    }

    public void setDupNo(Long dupNo) {
        this.dupNo = dupNo;
    }
}
