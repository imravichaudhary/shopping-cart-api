package ca.ravichaudhary.apishoppingcart.cart;

import org.springframework.data.annotation.Id;

public class CartItem {

    @Id
    private String id;
    private String productId;
    private Integer quantity;
    private Double amount;

    public CartItem(String productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItem(String productId, Integer quantity, Double amount) {
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
