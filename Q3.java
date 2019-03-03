//Q3. Implement Abstract Factory Pattern to create cars of different categories from different countries.
package com.bootcamp.design_patterns;

enum CarType {
    MINI, MICRO, LUXURY;
}

enum Location {
    INDIA, AUSTRALIA, USA;
}

abstract class Car {

    CarType carType;

    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class Micro extends Car {

    public Micro(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Micro Car");
    }
}

class Luxury extends Car {

    public Luxury(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Luxury Car");
    }

}

class Mini extends Car {

    public Mini(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Mini Car");
    }

}

class IndianCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;

        switch (carType) {

            case MINI:
                car = new Mini(Location.INDIA);
                break;
            case MICRO:
                car = new Micro(Location.INDIA);
                break;
            case LUXURY:
                car = new Luxury(Location.INDIA);
                break;
        }
        return car;
    }
}

class USACarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;

        switch (carType) {

            case MINI:
                car = new Mini(Location.USA);
                break;
            case MICRO:
                car = new Micro(Location.USA);
                break;
            case LUXURY:
                car = new Luxury(Location.USA);
                break;
        }
        return car;
    }
}

class AustraliaCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;

        switch (carType) {

            case MINI:
                car = new Mini(Location.AUSTRALIA);
                break;
            case MICRO:
                car = new Micro(Location.AUSTRALIA);
                break;
            case LUXURY:
                car = new Luxury(Location.AUSTRALIA);
                break;
        }
        return car;
    }
}

class CarFactory {

    static Car buildCar(CarType carType, Location location) {
        Car car = null;

        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case AUSTRALIA:
                car = AustraliaCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}

public class Q3 {

    public static void main(String[] args) {

        System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
    }
}
