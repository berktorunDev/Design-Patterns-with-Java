package design_patterns.factory;

/**
 * This class demonstrates the usage of the Factory Design Pattern to create and
 * work with different types of cars.
 */
public class FactoryPatternExampleUsage {
    public static void main(String[] args) {
        // Create a Sedan car
        Car sedan = CarFactory.createCar("Sedan");
        // Create a Hatchback car
        Car hatchback = CarFactory.createCar("Hatchback");
        // Create an SUV car
        Car suv = CarFactory.createCar("SUV");

        // Start and stop the Sedan car
        sedan.start();
        sedan.stop();

        // Start and stop the Hatchback car
        hatchback.start();
        hatchback.stop();

        // Start and stop the SUV car
        suv.start();
        suv.stop();
    }
}
