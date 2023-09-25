package design_patterns.factory;

/**
 * The Hatchback class implements the Car interface and represents a Hatchback
 * car.
 */
public class Hatchback implements Car {
    /**
     * Starts the Hatchback car.
     */
    @Override
    public void start() {
        System.out.println("Hatchback car started.");
    }

    /**
     * Stops the Hatchback car.
     */
    @Override
    public void stop() {
        System.out.println("Hatchback car stopped.");
    }
}
