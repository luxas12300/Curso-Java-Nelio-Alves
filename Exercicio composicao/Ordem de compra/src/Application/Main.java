package Application;

import Entities.Client;
import Entities.Enum.OrderStatus;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        Client client = new Client();
        System.out.print("Name: ");
        client.setName(sc.nextLine());
        System.out.print("Email: ");
        client.setEmail(sc.next());
        System.out.print("Birth date (DD/MM/YYYY): ");
        client.setBirthDate(sdf.parse(sc.next()));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.println("How many itens to this order?");
        int numeberItens = sc.nextInt();

        Date date = new Date();
        Order order = new Order(date,status, client);

        for(int i=1;i<=numeberItens;i++){
            System.out.println("Enter #"+ i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);
            
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, product, productPrice);
            order.addListItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}