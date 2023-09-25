package design_patterns.facade;

public class FacadePatternExampleUsage {
    public static void main(String[] args) {
        // Step 1: Create an OrderFacade
        OrderFacade orderFacade = new OrderFacade();

        // Step 2: Place an order
        System.out.println("Placing order...");
        orderFacade.placeOrder("12345", "Credit Card", 100.0, "customer@example.com");

        // Step 3: Explain the usage
        System.out.println("\nFacade Design Pattern is used to simplify the process of placing an order.");
        System.out.println("The OrderFacade provides a high-level interface to perform order-related tasks.");
    }
}
