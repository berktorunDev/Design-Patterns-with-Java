package design_patterns.observer;

public class ObserverPatternExampleUsage {
    public static void main(String[] args) {
        // Step 1: Create a WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Step 2: Create observers (PhoneDisplay and DesktopDisplay)
        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver desktopDisplay = new DesktopDisplay();

        // Step 3: Add observers to the WeatherStation
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(desktopDisplay);

        // Step 4: Set the temperature and notify observers
        weatherStation.setTemperature(25.0);

        // Step 5: Remove an observer
        weatherStation.removeObserver(phoneDisplay);

        // Step 6: Set the temperature again and notify remaining observer
        weatherStation.setTemperature(30.0);

        // Step 7: Explain the usage
        System.out
                .println("\nObserver Design Pattern is used to notify multiple observers about changes in a subject.");
        System.out.println(
                "The WeatherStation provides weather data, and observers like PhoneDisplay and DesktopDisplay receive updates.");
    }
}
