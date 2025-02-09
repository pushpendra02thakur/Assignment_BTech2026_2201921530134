// Definitions:

// Vehicle class:

// Attributes:
// make (String): Represents the make (manufacturer) of the vehicle.
// model (String): Represents the model of the vehicle.
// Methods:
// start(): Prints a message indicating that the vehicle is starting.
// stop(): Prints a message indicating that the vehicle is stopping.
// Car class (inherits from Vehicle):

// Attributes:
// numberOfDoors (int): Represents the number of doors of the car.
// Methods:
// honk(): Prints a message indicating that the car's horn is being honked.
// Motorcycle class (inherits from Vehicle):

// Attributes:
// engineType (String): Represents the type of engine used in the motorcycle (e.g., "2-stroke" or "4-stroke").
// Methods:
// wheelie(): Prints a message indicating that the motorcycle is performing a wheelie.


// codechef


// Base class
class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make=make;
        this.model=model;
    }

    void start() {
        System.out.println("Starting the " + make + " " + model);
    }

    void stop() {
        System.out.println("Stopping the " + make + " " + model);
    }
}

// Derived class Car inheriting from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int numberOfDoors) {
        super(make,model);
        this.numberOfDoors = numberOfDoors;
    }

    void honk() {
        System.out.println("Honking the horn of the " + make + " " + model);
    }
}

// Derived class Motorcycle inheriting from Vehicle
class Motorcycle extends Vehicle {
    String engineType;

    Motorcycle(String make, String model, String engineType) {
        super(make,model);
        this.engineType = engineType;
    }

    void wheelie() {
        System.out.println("Performing a wheelie on the " + make + " " + model);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 4);
        myCar.start();
        myCar.honk();
        myCar.stop();

        // Create an instance of the Motorcycle class
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", "4-stroke");
        myMotorcycle.start();
        myMotorcycle.wheelie();
        myMotorcycle.stop();
    }
}
