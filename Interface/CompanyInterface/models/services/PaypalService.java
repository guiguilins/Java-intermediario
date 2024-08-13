package Interface.CompanyInterface.models.services;

public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFee(double amount) {
       double result = 0;
       return result;
    }

    @Override
    public double interest(double amount, Integer months) {
            return 0;
    }

}
