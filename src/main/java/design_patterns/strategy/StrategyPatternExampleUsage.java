package design_patterns.strategy;

public class StrategyPatternExampleUsage {
    public static void main(String[] args) {
        // Step 1: Create a PaymentContext with a CreditCardPaymentStrategy
        PaymentContext creditCardPaymentContext = new PaymentContext(new CreditCardPaymentStrategy());

        // Step 2: Execute a credit card payment
        creditCardPaymentContext.executePayment(100.0);

        // Step 3: Create a PaymentContext with a PayPalPaymentStrategy
        PaymentContext paypalPaymentContext = new PaymentContext(new PayPalPaymentStrategy());

        // Step 4: Execute a PayPal payment
        paypalPaymentContext.executePayment(50.0);

        // Step 5: Explain the usage
        System.out.println("\nStrategy Design Pattern is used to select and execute different payment methods.");
        System.out.println("A PaymentContext is created with a specific PaymentStrategy.");
        System.out.println("The executePayment method of PaymentContext executes the payment using the selected strategy.");
    }
}
