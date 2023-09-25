package design_patterns.observer;

/**
 * PhoneDisplay is a concrete observer class that displays weather information
 * on a phone.
 */
class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.println("Phone Display: Temperature is " + temperature + "°C");
    }
}
