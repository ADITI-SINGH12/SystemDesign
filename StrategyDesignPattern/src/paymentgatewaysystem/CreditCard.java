package paymentgatewaysystem;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Credit card payment proceeds");
    }
}
