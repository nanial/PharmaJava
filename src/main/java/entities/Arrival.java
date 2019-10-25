package entities;

import javax.persistence.Entity;
import java.util.Date;


@Entity

public class Arrival {

    private Integer id;
    private Date dateOfArrival;
    private Integer supplierID;
    private String relatedDocument;

    public Arrival() {
    }

    public Integer getId() {
        return id;
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public String getRelatedDocument() {
        return relatedDocument;
    }

    public void setRelatedDocument(String relatedDocument) {
        this.relatedDocument = relatedDocument;
    }

    @Override
    public String toString() {

        return "Arrival{" +
                "id=" + id +
                ", dateOfArrival=" + dateOfArrival +
                ", supplierID=" + supplierID +
                ", relatedDocument='" + relatedDocument + '\'' +
                '}';
    }
}
