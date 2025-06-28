package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

private Date manufacturedDate;
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " $ " + getPrice() + " Manufatured date: " + sdf.format(manufacturedDate));
        return sb.toString();
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }
}
