//You are given a class Student having attributes as name and age and a display method to print name and age of Student. Create a object of student class with given name and age. Use display method to print information of the Student.

//CodeChef

import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.name = scanner.next();
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}
