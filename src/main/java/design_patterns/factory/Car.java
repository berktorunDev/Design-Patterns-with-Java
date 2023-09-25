package design_patterns.factory;

/**
 * The Car interface is an interface implemented by different types of cars.
 * It defines the start and stop operations for all cars.
 */
public interface Car {
    /**
     * Starts the car.
     */
    void start();

    /**
     * Stops the car.
     */
    void stop();
}
