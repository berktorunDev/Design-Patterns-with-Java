package design_patterns.strategy;

/**
 * CreditCardPaymentStrategy is a concrete payment strategy class for credit
 * card payments.
 */
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Add logic to process credit card payment
    }
}