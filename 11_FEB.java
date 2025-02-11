// Student and Postgraduate
// Create a Java program that models the hierarchy of students and postgraduates in an educational institution. Use multilevel inheritance to represent the following classes:

// Student Class: This is the base class that contains the following attributes:

// studentName (String): The name of the student.
// It also contains a method displayDetails that displays the student's name.

// Graduate Class: This class inherits from the Student class and adds the following attribute:

// graduationYear (int): The year the student is expected to graduate.
// It overrides the displayDetails method to include the graduation year.

// Postgraduate Class: This class inherits from the Graduate class and adds the following attributes:

// thesisTopic (String): The topic of the postgraduate student's thesis.
// It overrides the displayDetails method to include the thesis topic.

//codechef


// Base class
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void displayDetails() {
        System.out.println(studentName);
    }
}

// Graduate class (inherits from Student)
class Graduate extends Student {
    private int graduationYear;

    public Graduate(String studentName, int graduationYear) {
        super(studentName);
        this.graduationYear=graduationYear;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(graduationYear);
    }
}

// Postgraduate class (inherits from Graduate)
class Postgraduate extends Graduate {
    private String thesisTopic;

    public Postgraduate(String studentName, int graduationYear, String thesisTopic) {
        super(studentName,graduationYear);
        this.thesisTopic=thesisTopic;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(thesisTopic);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create instances of Student and Postgraduate
        Student student = new Student("Alice");
        Postgraduate postgraduate = new Postgraduate("Carol", 2025, "Quantum Mechanics");

        // Display details of each student type
        student.displayDetails();
        System.out.println();
        postgraduate.displayDetails();
    }
}
