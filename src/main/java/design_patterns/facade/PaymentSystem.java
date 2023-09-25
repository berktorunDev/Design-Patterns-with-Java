package design_patterns.facade;

/**
 * PaymentSystem is a subsystem that handles payment processing.
 */
class PaymentSystem {
    public void processPayment(String paymentMethod, double amount) {
        // Process payment
        System.out.println("Payment of $" + amount + " via " + paymentMethod + " processed successfully.");
    }
}
