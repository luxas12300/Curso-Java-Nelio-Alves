import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for(int i=1;i<=numberProducts;i++) {

            System.out.printf("Enter Product data #"+i);
            System.out.printf("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Price: ");
            double price = sc.nextDouble();


            if(type == 'c') {

                list.add(new Product(name, price));

            }if(type == 'u'){
                System.out.println("");
                Date data = new Date();
                list.add( new UsedProduct(name, price,data));
            }

            if(type == 'i'){
                System.out.printf("Customs Fee: ");
                double customFee = sc.nextDouble();
                list.add( new ImportedProduct(name, price, customFee));
            }
        }
        System.out.println("------ PRICE TAGS -------");
        for (Product prod: list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}