// Define a Wheel class with attribute type and Printtype method to print type of wheel.

// Define a Car class with the following attributes:

// make: A string representing the maker of the car
// model: A string representing the model of the car
// Four Wheel objects representing the car's wheels: frontLeftWheel, frontRightWheel, rearLeftWheel, and rearRightWheel.
// Implement a member function printInfo in the Car class that displays the car's make, model, and the type of each wheel.


//codechef

class Wheel {
    String type;

    Wheel(String type) {
        this.type = type;
    }

    void printType() {
        System.out.println("Wheel Type: " + type);
    }
}

class Car {
    String make;
    String model;
    Wheel frontLeftWheel;
    Wheel frontRightWheel;
    Wheel rearLeftWheel;
    Wheel rearRightWheel;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
        frontLeftWheel = new Wheel("Front Left");
        frontRightWheel = new Wheel("Front Right");
        rearLeftWheel = new Wheel("Rear Left");
        rearRightWheel = new Wheel("Rear Right");
    }

    void printInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
        frontLeftWheel.printType();
        frontRightWheel.printType();
        rearLeftWheel.printType();
        rearRightWheel.printType();
    }
}

class Codechef {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.printInfo();
    }
}
