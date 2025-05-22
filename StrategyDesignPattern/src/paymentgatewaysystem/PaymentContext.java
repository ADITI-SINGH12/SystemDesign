package paymentgatewaysystem;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    void paymentMode(){
        this.paymentStrategy.processPayment();
    }
}
