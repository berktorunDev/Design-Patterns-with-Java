package design_patterns.factory;

/**
 * CarFactory is a factory class that uses the Factory Design Pattern to create
 * different types of cars.
 * It produces objects based on the specified car type.
 */
public class CarFactory {
    /**
     * Creates a car object of the specified type ("Sedan", "Hatchback", or "SUV")
     * and returns it.
     *
     * @param carType The type of car to create
     * @return A car object of the specified type
     * @throws IllegalArgumentException Thrown when an invalid car type is provided.
     */
    public static Car createCar(String carType) {
        if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("Hatchback")) {
            return new Hatchback();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new Suv();
        } else {
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}
