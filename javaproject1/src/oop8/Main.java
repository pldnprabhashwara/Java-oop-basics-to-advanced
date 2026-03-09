package oop8;

class Vehicle {
    String model;
    double rentalPricePerDay;

    Vehicle(String model, double rentalPricePerDay) {
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}

class Car extends Vehicle {
    int numSeats;

    Car(String model, double rentalPricePerDay, int numSeats) {
        super(model, rentalPricePerDay);
        this.numSeats = numSeats;
    }
}

class Motorcycle extends Vehicle {
    int engineCapacity;

    Motorcycle(String model, double rentalPricePerDay, int engineCapacity) {
        super(model, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Nissan", 50.0, 5);
        Motorcycle motorcycle = new Motorcycle("Yamaha", 30.0, 150);

        double carCost = car.calculateRentalCost(4);
        double bikeCost = motorcycle.calculateRentalCost(4);

        System.out.println("Car Rental Cost: " + carCost);
        System.out.println("Motorcycle Rental Cost: " + bikeCost);
    }
}
