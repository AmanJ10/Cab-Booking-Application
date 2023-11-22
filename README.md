# CabBookingApplication
 Cab Booing Application using Design Patterns


This is a simple Cab Booking application implemented in Java. The application uses various design patterns such as Singleton, Abstract Factory, Strategy, and Proxy to manage different aspects of the booking process.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Design Patterns](#design-patterns)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Output](#output)

## Introduction

The Cab Booking Application is designed to provide users with a convenient way to book different types of cabs, including Prime Sedan, Mini, and Auto. The application incorporates design patterns to enhance modularity, extensibility, and maintainability.

## Features

- User authentication with regular and subscription pricing strategies.
- Booking of Prime Sedan, Mini, and Auto vehicles.
- Different features available for each vehicle type.

## Design Patterns

The application leverages the following design patterns:

- **Singleton Pattern**: Ensures that there is only one instance of the `BookingManager` class to manage cab bookings.

- **Abstract Factory Pattern**: Provides an interface for creating families of related or dependent objects. Factories include `PrimeSedanFactory`, `MiniFactory`, and `AutoFactory`.

- **Strategy Pattern**: Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. Strategies include pricing strategies (`RegularPricing` and `SubscriptionPricingStratergy`) and features strategies (`ACStratergy`, `noFeaturesStratergy`, `wifiandACStratergy`).

- **Proxy Pattern**: Acts as a surrogate or placeholder for another object to control access to it. The `ProxySubscriber` class is used to authenticate and apply pricing strategies based on the user's subscription status.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/cab-booking-app.git
    ```

2. Compile and run the application:

    ```bash
    cd cab-booking-app
    javac cabBook.java
    java cabBook
    ```

3. Follow the on-screen prompts to authenticate, choose a vehicle type, and book a cab.

## Dependencies

- Java SDK (version X.X.X)
- Scanner class (standard Java library)
  
## Output
-Image below shows that the user is a subscriber and has discount applied on cab rides
![Screenshot 2023-11-22 093423](https://github.com/AmanJ10/Cab-Booking-Application/assets/83915557/b0f31209-5038-4007-9fb9-3631cc4ee3c7)


-Image below shows that the user is not a subscriber
![Screenshot 2023-11-22 093510](https://github.com/AmanJ10/Cab-Booking-Application/assets/83915557/7775ba44-cb77-406f-9740-2fd2949ca242)


