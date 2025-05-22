package paymentgatewaysystem;

public class ClientCall {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext(new CreditCard());
        paymentContext.paymentMode();
    }
}
