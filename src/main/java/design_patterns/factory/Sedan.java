package design_patterns.factory;

// Sedan.java
/**
 * The Sedan class implements the Car interface and represents a Sedan car.
 */
public class Sedan implements Car {
    /**
     * Starts the Sedan car.
     */
    @Override
    public void start() {
        System.out.println("Sedan car started.");
    }

    /**
     * Stops the Sedan car.
     */
    @Override
    public void stop() {
        System.out.println("Sedan car stopped.");
    }
}
