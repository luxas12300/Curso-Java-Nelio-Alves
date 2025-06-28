package Services;

import Entities.Contract;
import Entities.Installment;
import Intercafes.OnlinePaymentsService;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentsService onlinePaymentsService;
    public ContractService(){}
    public ContractService(OnlinePaymentsService onlinePaymentsService) {
        this.onlinePaymentsService = onlinePaymentsService;
    }

    public void processContract(Contract contract, Integer months){
        double basicPayment = contract.getTotalValue() / months;
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentsService.interest(basicPayment,i);
            double fee = onlinePaymentsService.paymentFee(basicPayment + interest);
            double finalPayment = basicPayment + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, finalPayment));
        }
    }
}
