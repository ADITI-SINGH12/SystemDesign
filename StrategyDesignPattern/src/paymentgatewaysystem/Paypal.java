package paymentgatewaysystem;

public class Paypal implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Paypal card payment proceeds");
    }
}
