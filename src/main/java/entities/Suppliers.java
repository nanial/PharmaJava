package entities;

public class Suppliers {
    private Integer id;
    private String nameOfSuppliers;
    private String settlementAccount;
    private Integer residentRb;

    public Suppliers() {
    }

    public Integer getId() {
        return id;
    }


    public String getNameOfSuppliers() {
        return nameOfSuppliers;
    }

    public void setNameOfSuppliers(String nameOfSuppliers) {
        this.nameOfSuppliers = nameOfSuppliers;
    }

    public String getSettlementAccount() {
        return settlementAccount;
    }

    public void setSettlementAccount(String settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    public Integer getResidentRb() {
        return residentRb;
    }

    public void setResidentRb(Integer residentRb) {
        this.residentRb = residentRb;
    }
}
