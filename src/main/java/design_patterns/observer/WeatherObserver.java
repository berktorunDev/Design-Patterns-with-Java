package design_patterns.observer;

/**
 * WeatherObserver is the observer interface that defines the update method.
 */
interface WeatherObserver {
    void update(double temperature);
}