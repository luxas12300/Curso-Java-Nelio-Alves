package Entities;
public class OrderItem {
    private int quantity;
    private double productPrice;
    private Product product = new Product();

    public OrderItem(){}
    public OrderItem(int quantity, Product product, double productPrice){
        this.quantity = quantity;
        this.product = product;
        this.productPrice = productPrice;
    }

    public String toString(){
        return product.getName() + ", $" +
        String.format("%.2f", productPrice) +
        ", Quantity: "
        + quantity + 
        ", Subtotal: $" +
        String.format("%.2f",calculaSubTotal());
    }

    public double calculaSubTotal(){
        return quantity * productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
