package design_patterns.factory;

/**
 * The SUV class implements the Car interface and represents an SUV car.
 */
public class Suv implements Car {
    /**
     * Starts the SUV car.
     */
    @Override
    public void start() {
        System.out.println("SUV car started.");
    }

    /**
     * Stops the SUV car.
     */
    @Override
    public void stop() {
        System.out.println("SUV car stopped.");
    }
}
