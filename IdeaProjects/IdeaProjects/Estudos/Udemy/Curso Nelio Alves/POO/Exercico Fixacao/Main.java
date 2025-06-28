import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double quantity = sc.nextDouble();

        double total = Calculator.calcula(dollarPrice, quantity);

        System.out.printf("Amount to be paid in reais = %.2f%n", total);
    }
}
