package Intercafes;

public interface OnlinePaymentsService {
    public double paymentFee(double amount);
    public double interest(double amount, Integer months);

}
