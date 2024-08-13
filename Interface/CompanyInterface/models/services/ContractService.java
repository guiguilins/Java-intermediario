package Interface.CompanyInterface.models.services;

import java.time.LocalDate;

import Interface.CompanyInterface.models.entities.Contract;
import Interface.CompanyInterface.models.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue();

        for (int i = 1; i <= months; i++) {
            LocalDate dueData = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;
        }
    }
}
