// You are tasked with creating a class called ShapeCalculator that contains static methods for calculating the area of geometric shapes: squares and rectangles. Implement two static methods for calculating the area of these shapes.

// Create a class ShapeCalculator with the following public static member functions:

// static int calculateArea(int sideLength): Takes a int sideLength as a parameter and calculates the area of a square. Return the result.
// static int calculateArea(int length, int width): Takes two int, length and width, as parameters and calculates the area of a rectangle. Return the result.

//codechef

import java.util.Scanner;

class ShapeCalculator {
    // Calculate the area of a square
    static int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }

    // Calculate the area of a rectangle
    static int calculateArea(int length, int width) {
        return length * width;
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareSide, length, width;
        squareSide = scanner.nextInt();
        length = scanner.nextInt();
        width = scanner.nextInt();

        // Calculate the area of a square
        int squareArea = ShapeCalculator.calculateArea(squareSide);

        // Calculate the area of a rectangle
        int rectangleArea = ShapeCalculator.calculateArea(length, width);

        System.out.println(squareArea);
        System.out.println(rectangleArea);
    }
}
