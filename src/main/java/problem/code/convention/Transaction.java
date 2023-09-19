package problem.code.convention;

public class Transaction {

    public Transaction(Long id, String type, String status, String method, Double amount) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.method = method;
        this.amount = amount;
    }

    private Long id;
    private String type;
    private String status;
    private String method;
    private Double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
