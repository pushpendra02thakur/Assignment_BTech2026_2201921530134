// Animal Class
// Suppose you are designing a basic system to model different types of animals. There are two types of animals: Animal and Dog. Each animal has an attribute called name.

// Create a base class Animal with a property name (a string).
// Create a class Dog that inherits from Animal. The Dog class should have an additional property breed (a string) to represent the breed of the dog.
// In the main function, create an instance of the Dog class, set its name and breed properties, and then display the name and breed of the dog.

//codechef

import java.util.Scanner;

// Base class Animal
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

// Derived class Dog
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println(name);
        System.out.println(breed);
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for name and breed
        String name = scanner.next();
        String breed = scanner.next();

        // Create a Dog object
        Dog myDog = new Dog(name, breed);

        // Display information about the Dog
        myDog.displayInfo();

        scanner.close();
    }
}
