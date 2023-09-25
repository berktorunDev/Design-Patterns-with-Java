package design_patterns.strategy;

/**
 * PaymentContext is the context class that uses a PaymentStrategy to execute a
 * payment.
 */
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Executes the payment using the selected PaymentStrategy.
     *
     * @param amount The amount to be paid
     */
    public void executePayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}