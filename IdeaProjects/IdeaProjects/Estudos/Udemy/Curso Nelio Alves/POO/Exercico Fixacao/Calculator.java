public class Calculator {
    public static double calcula(double price, double quantity){
        double total = price * quantity;
        double iof = total * 0.06;
        return total += iof;
    }
}
