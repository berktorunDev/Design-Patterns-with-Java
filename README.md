# Design Patterns in Java Project

This Java project demonstrates the usage of various design patterns, including Factory, Singleton, Strategy, Observer, and Facade design patterns. Each design pattern is implemented using relevant classes and explained through specific usage scenarios.

## Project Structure

The project is organized into different packages, each corresponding to a specific design pattern. Here's an overview of the packages and their contents:

### Facade Pattern (src/facade)

### What does the Facade Pattern aim for?
The `Facade Pattern` provides a unified interface to a set of interfaces in a subsystem. It simplifies a complex system by providing a higher-level interface. This is useful for hiding the complexities of a system and making it easier to use.

### Scenario
Imagine you're running an online store, and after every order, you want to send confirmation emails to customers. That's where the Facade Pattern comes in and simplifies this for you. With just a click, it takes care of sending those order confirmations to customers.

- **EmailService.java (Class)**: A subsystem that sends email notifications.
- **FacadePatternExampleUsage.java (Main)**: Demonstrates the Facade Design Pattern through a simplified order processing scenario.
- **InventorySystem.java (Class)**: A subsystem that handles the inventory of products.
- **OrderFacade.java (Class)**: Facade class that simplifies the order process, including inventory checks, payment processing, and email notifications.
- **PaymentSystem.java (Class)**: A subsystem that handles payment processing.

### Factory Pattern (src/factory)

### What does the Factory Pattern aim for?
In the `Factory Pattern`, we tackle the problem of creating objects without specifying the exact class of object that will be created. This pattern is useful when we need to centralize the creation of objects and provide a common interface for creating various concrete implementations.

### Scenario
You're in charge of a car manufacturing factory where you produce different car types: Sedan, Hatchback, and SUV. The Factory Pattern makes life easier when it comes to creating these various vehicles. You can create different car types with a simple click.

- **Car.java (Interface)**: Represents a generic car interface.
- **CarFactory.java (Class)**: Demonstrates the Factory Design Pattern to create different types of cars.
- **FactoryPatternExampleUsage.java (Main)**: Demonstrates the Factory Design Pattern through the creation of various car types.
- **Hatchback.java (Class)**: Represents a hatchback car.
- **Sedan.java (Class)**: Represents a sedan car.
- **Suv.java (Class)**: Represents an SUV car.

### Singleton Pattern (src/singleton)

### What does the Singleton Pattern aim for?
The `Singleton Pattern` ensures that there is only one instance of a class and provides a global point of access. This is valuable when exactly one object needs to coordinate actions across the system.

### Scenario
Picture this—you're working on a software project, and you need to manage project settings. The Singleton Pattern steps in, making it easy to manage these settings from a single place. Everyone can access and make changes to the same settings, streamlining the process.

- **ProjectSettings.java (Class)**: Demonstrates the Singleton Design Pattern by managing project settings.
- **SingletonPatternExampleUsage.java (Main)**: Demonstrates the Singleton Design Pattern through the management of project settings.

### Strategy Pattern (src/strategy)

### What does the Strategy Pattern aim for?
The `Strategy Pattern` allows us to switch between different algorithms or behaviors dynamically. In our scenario, we demonstrate various payment methods and strategies for executing payments.

### Scenario
While shopping online, you want to choose your preferred payment method. The Strategy Pattern gives you choices. Credit card? PayPal? Take your pick and complete your payment hassle-free.

- **CreditCardPaymentStrategy.java (Class)**: Concrete strategy for credit card payments.
- **PaymentContext.java (Class)**: Context class that uses a PaymentStrategy to execute payments.
- **PaymentStrategy.java (Interface)**: Defines the PaymentStrategy interface.
- **PayPalPaymentStrategy.java (Class)**: Concrete strategy for PayPal payments.
- **StrategyPatternExampleUsage.java (Main)**: Demonstrates the Strategy Design Pattern through various payment methods and strategies.
  
### Observer Pattern (src/observer)

### What does the Observer Pattern aim for?
The `Observer Pattern` facilitates one-to-many dependencies between objects, making it useful for implementing event handling systems. Our scenario involves weather monitoring, where multiple displays receive updates when weather data changes.

### Scenario
You're using a weather app, and you need real-time weather updates. The Observer Pattern ensures that you receive those real-time weather updates on both your desktop and phone. It keeps you informed, so you'll know when to grab your umbrella if it starts raining!

- **DesktopDisplay.java (Class)**: Concrete observer for displaying weather information on a desktop.
- **ObserverPatternExampleUsage.java (Main)**: Demonstrates the Observer Design Pattern through a weather monitoring scenario.
- **PhoneDisplay.java (Class)**: Concrete observer for displaying weather information on a phone.
- **WeatherObserver.java (Interface)**: Observer interface with the `update` method.
- **WeatherStation.java (Class)**: Subject class that provides weather data to observers.

## Usage

To run the project and see each design pattern in action, you can use the provided main classes:

- **FacadePatternExampleUsage.java**: Demonstrates the Facade Design Pattern through a simplified order processing scenario.
- **FactoryPatternExampleUsage.java**: Demonstrates the Factory Design Pattern through the creation of various car types.
- **SingletonPatternExampleUsage.java**: Demonstrates the Singleton Design Pattern through the management of project settings.
- **StrategyPatternExampleUsage.java**: Demonstrates the Strategy Design Pattern through various payment methods and strategies.
- **ObserverPatternExampleUsage.java**: Demonstrates the Observer Design Pattern through a weather monitoring scenario.

Simply run the desired main class to observe the behavior of each design pattern.

## Contributing

If you want to contribute to this project by adding more design patterns, improving code, or providing better
