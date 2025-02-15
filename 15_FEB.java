// Class Definitions:

// Calculator class:
// Provide overloaded add methods as follows:
// int add(int a, int b) - Adds two integers and returns the result.
// int add(int a, int b, int c) - Adds three integers and returns the result.
// int add(int a, int b, int c, int d) - Adds four integers and returns the result

//codechef

class Calculator {
     // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add four integers
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class Codechef {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using the different overloaded add methods
        int sum1 = calculator.add(2, 3);
        int sum2 = calculator.add(2, 3, 4);
        int sum3 = calculator.add(2, 3, 4, 5);

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }
}
