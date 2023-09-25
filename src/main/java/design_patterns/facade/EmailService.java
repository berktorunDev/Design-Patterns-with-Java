package design_patterns.facade;

/**
 * EmailService is a subsystem that sends email notifications.
 */
class EmailService {
    public void sendOrderConfirmation(String customerEmail) {
        // Send order confirmation email
        System.out.println("Order confirmation email sent to: " + customerEmail);
    }
}