package entities;

import javax.persistence.Entity;

@Entity

public class Manufactures {
    private Integer id;
    private String nameOfManufactures;
    private String country;
    private String account;

    public Manufactures() {
    }

    public Integer getId() {
        return id;
    }

    public String getNameOfManufactures() {
        return nameOfManufactures;
    }

    public void setNameOfManufactures(String nameOfManufactures) {
        this.nameOfManufactures = nameOfManufactures;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Manufactures{" +
                "id=" + id +
                ", nameOfManufactures='" + nameOfManufactures + '\'' +
                ", country='" + country + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
