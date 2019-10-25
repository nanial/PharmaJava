package entities;

public class ProductToOrder {
    private Integer id;
    private Integer orderID;
    private Integer productID;
    private Integer quantity;

    public ProductToOrder() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
