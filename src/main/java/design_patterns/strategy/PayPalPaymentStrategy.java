package design_patterns.strategy;

/**
 * PayPalPaymentStrategy is a concrete payment strategy class for PayPal
 * payments.
 */
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Add logic to process PayPal payment
    }
}