import Entities.Contract;
import Entities.Installment;
import Services.ContractService;
import Services.PaypalService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada de dados do contrato:");
        System.out.println("Número: ");
        String number = sc.nextLine();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor de contrato: ");
        double totalValue = sc.nextDouble();
        System.out.println("Entre com o número de parcelas: ");
        int installment = sc.nextInt();

        Contract contract = new Contract(number,date,totalValue);
        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract,installment);

        for(Installment instalment: contract.getInstallments()){
            System.out.println(instalment);
        }

        sc.close();
    }
}
