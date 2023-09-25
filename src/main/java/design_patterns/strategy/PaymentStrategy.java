package design_patterns.strategy;

/**
 * PaymentStrategy is the interface implemented by different payment methods.
 * It defines the processPayment method that each payment method must implement.
 */
public interface PaymentStrategy {
    void processPayment(double amount);
}