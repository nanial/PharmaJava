package entities;

import javax.persistence.Entity;

@Entity

public class Medical {

    private String nameOfMedical;
    private String annotation;
    private Integer manufacturesID;
    private String unitOfMeasure;
    private Integer id;
    private String unitName;

    public Medical() {
    }

    public String getNameOfMedical() {
        return nameOfMedical;
    }

    public void setNameOfMedical(String nameOfMedical) {
        this.nameOfMedical = nameOfMedical;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Integer getManufacturesID() {
        return manufacturesID;
    }

    public Integer getId() {
        return id;
    }

    public void setManufacturesID(Integer manufacturesID) {
        this.manufacturesID = manufacturesID;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Medical{" +
                "nameOfMedical='" + nameOfMedical + '\'' +
                ", annotation='" + annotation + '\'' +
                ", manufacturesID=" + manufacturesID +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", id=" + id +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
