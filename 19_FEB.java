// Create a program to manage a vehicle rental service. Implement a class hierarchy with a base class Vehicle and a derived class Car. Each class should have the following properties:

// Vehicle:

// Properties: model (string) & rentalRate (integer)

// Methods: int calculateRentalCost(int days)

// Rental Cost for a Vehicle:

// rental cost = number of rental days * rental rate
// Car (Derived from Vehicle):

// Additional Property: seats (integer)

// Override the int calculateRentalCost(int days) method to calculate and return the rental cost for a car based on the number of seats, the number of rental days, and the rental rate. The rental cost should be computed as follows:

// Rental Cost for a Car:

// rental cost = number of seats * number of rental days * rental rate

//codechef

import java.util.Scanner;

class Vehicle {
    public String model;
    public int rentalRate;

    public Vehicle(String model, int rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public int calculateRentalCost(int days) {
        // Default calculation based on rental rate
        return days * rentalRate;
    }
}

class Car extends Vehicle {
    public int seats;

    public Car(String model, int rentalRate, int seats) {
        super(model, rentalRate);
        this.seats = seats;
    }

    @Override
    public int calculateRentalCost(int days) {
        // Override the method to calculate cost based on seats, days, and rental rate
        return seats * days * rentalRate;
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String model = sc.nextLine();
        int rentalRate = sc.nextInt();
        int seats = sc.nextInt();
        int days = sc.nextInt();

        Car car = new Car(model, rentalRate, seats);

        int rentalCost = car.calculateRentalCost(days);
        System.out.println(rentalCost);

        sc.close();
    }
}
