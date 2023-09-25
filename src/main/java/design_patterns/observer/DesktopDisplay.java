package design_patterns.observer;

/**
 * DesktopDisplay is a concrete observer class that displays weather information
 * on a desktop.
 */
class DesktopDisplay implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.println("Desktop Display: Temperature is " + temperature + "°C");
    }
}
