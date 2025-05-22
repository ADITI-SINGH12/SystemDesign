package paymentgatewaysystem;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("UPI payment proceeds");
    }
}
