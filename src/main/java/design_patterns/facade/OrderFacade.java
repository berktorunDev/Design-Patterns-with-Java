package design_patterns.facade;

/**
 * OrderFacade is a facade class that simplifies the order process for the
 * client.
 * It provides a high-level interface to perform order-related tasks.
 */
public class OrderFacade {
    private InventorySystem inventorySystem;
    private PaymentSystem paymentSystem;
    private EmailService emailService;

    public OrderFacade() {
        this.inventorySystem = new InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.emailService = new EmailService();
    }

    /**
     * Place an order by performing the following steps:
     * 1. Check product availability in stock.
     * 2. Process payment.
     * 3. Send order confirmation email.
     *
     * @param productId     The ID of the product being ordered
     * @param paymentMethod The payment method to be used
     * @param amount        The amount to be paid
     * @param customerEmail The email address of the customer
     */
    public void placeOrder(String productId, String paymentMethod, double amount, String customerEmail) {
        if (inventorySystem.isProductInStock(productId)) {
            paymentSystem.processPayment(paymentMethod, amount);
            emailService.sendOrderConfirmation(customerEmail);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Product not in stock. Order could not be placed.");
        }
    }
}