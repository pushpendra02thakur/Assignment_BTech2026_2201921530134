// Start by defining a base class Vehicle with a method accelerate(). Then, create two subclasses, Car and Bicycle, which extend the Vehicle class.
// These subclasses should override the accelerate() method to provide specific implementations for accelerating each type of vehicle.

// The Vehicle class should have a method accelerate() which prints: "The vehicle accelerates."
// The Car class should have a constructor that takes an initial speed (an integer) as an argument.
// When the accelerate() method is called for a car, it should increase the speed by 10 km/h and print: "The car accelerates. Current speed: {currentSpeed} km/h," where {currentSpeed} is the updated speed of the car.
// The Bicycle class should have a constructor that takes an initial speed (an integer) as an argument.
// When the accelerate() method is called for a bicycle, it should increase the speed by 5 km/h and print: "The bicycle accelerates.
// Current speed: {currentSpeed} km/h," where {currentSpeed} is the updated speed of the bicycle.


//codechef


class Vehicle {
    public void accelerate() {
        System.out.println("The vehicle accelerates.");
    }
}

class Car extends Vehicle {
    private int speed;

    public Car(int initialSpeed) {
        this.speed = initialSpeed;
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("The car accelerates. Current speed: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    private int speed;

    public Bicycle(int initialSpeed) {
        this.speed = initialSpeed;
    }

    @Override
    public void accelerate() {
        speed += 5;
        System.out.println("The bicycle accelerates. Current speed: " + speed + " km/h");
    }
}

class Codechef {
    public static void main(String[] args) {
        Car car = new Car(20); // Initial speed of the car is 20 km/h
        Bicycle bicycle = new Bicycle(15); // Initial speed of the bicycle is 15 km/h

        car.accelerate(); // Accelerate the car
        bicycle.accelerate(); // Accelerate the bicycle
    }
}
