package problem.code.convention.dependency;

public class FileUploadDTO {
    private String idNo;
    private String busNo;
    private String hoKhau;
    private String congVan;
    private String contractNo;
    private String otherDoc;
    private String fileName;
    private String otherDocDetail;
    private String link;

    public FileUploadDTO() {
    }

    public FileUploadDTO(String link) {
        this.link = link;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getHoKhau() {
        return hoKhau;
    }

    public void setHoKhau(String hoKhau) {
        this.hoKhau = hoKhau;
    }

    public String getCongVan() {
        return congVan;
    }

    public void setCongVan(String congVan) {
        this.congVan = congVan;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getOtherDoc() {
        return otherDoc;
    }

    public void setOtherDoc(String otherDoc) {
        this.otherDoc = otherDoc;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOtherDocDetail() {
        return otherDocDetail;
    }

    public void setOtherDocDetail(String otherDocDetail) {
        this.otherDocDetail = otherDocDetail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
