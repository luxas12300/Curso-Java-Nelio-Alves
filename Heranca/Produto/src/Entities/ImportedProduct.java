package Entities;

public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " $ " + totalPrice() + " (Custom Fees : " +  getCustomFee() + ")");
        return sb.toString();
    }

    public double totalPrice(){
        double totalPrice = getPrice() + customFee;
        return totalPrice;
    }


    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }
}
