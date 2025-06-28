package Services;

import Intercafes.OnlinePaymentsService;

public class PaypalService implements OnlinePaymentsService {
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, Integer months) {
        return amount * 0.01 * months;
    }
}
