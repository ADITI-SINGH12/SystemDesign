package paymentgatewaysystem;

public class CryptoCurrency implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Crypto currency payment proceeds");
    }
}
