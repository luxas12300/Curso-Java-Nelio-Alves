package atividade;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity){
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }

    public void totalValue(){
        double total = getPrice()*quantity;
        System.out.println(getName() +", " + total);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
