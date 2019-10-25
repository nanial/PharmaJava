package entities;
import servlets.AdminProductServlet;
import servlets.ConnectorDB;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer categoryID;
    private Integer code;
    private Float price;
    private Integer availability;
    private String nameOfMedical;
    private Integer isNew;
    private Integer isRecommended;
    private Integer medicalID;
    private Integer arrivalsID;
    private String image;

    
    public Product(Integer id,  Float price,  String nameOfMedical) {
        this.id = id;
        this.price = price;
        this.nameOfMedical = nameOfMedical;
    }

    public List<Product> moveData(){
        List<Product>products = new ArrayList<Product>();
        try{

            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery ("select a.ID, a.price, m.NameOfMedical " +
                    "from product a inner join medical m on a.medicalID = m.ID " +
                    "where a.status = 1 order by m.NameOfMedical asc");
            while (resultSet.next()){
                Product product = new Product();
                product.setId(resultSet.getInt(1));
                product.setPrice(resultSet.getFloat(2));
                product.setNameOfMedical(resultSet.getString(3));
                products.add(product);
            }

        }
        catch(SQLException sq){
            System.out.println(sq.getStackTrace());
        }
        return products;
    }

    public Product() {
    }

    public String getNameOfMedical() {
        return nameOfMedical;
    }

    public void setNameOfMedical(String nameOfMedical) {
        this.nameOfMedical = nameOfMedical;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public Integer getNew() {
        return isNew;
    }

    public void setNew(Integer aNew) {
        isNew = aNew;
    }

    public Integer getRecommended() {
        return isRecommended;
    }

    public void setRecommended(Integer recommended) {
        isRecommended = recommended;
    }

    public Integer getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(Integer medicalID) {
        this.medicalID = medicalID;
    }

    public Integer getArrivalsID() {
        return arrivalsID;
    }

    public void setArrivalsID(Integer arrivalsID) {
        this.arrivalsID = arrivalsID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
