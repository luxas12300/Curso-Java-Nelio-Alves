package Entities;

import Entities.Enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;
    
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}
    public Order(Date moment, OrderStatus status, Client cLient){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+sdf.format(moment) + "\n");
        sb.append("Order status: " + status +"\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for(OrderItem orderItem : orderItems){
            sb.append(orderItem + "\n");
        }
        sb.append("Total price :$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem item: orderItems){
            sum += item.calculaSubTotal();
        }
        return sum;
    }

    public void addListItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
