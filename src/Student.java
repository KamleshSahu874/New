import java.sql.SQLOutput;
class Student {

    String name;
    int rollNumber;
    double marks;
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Create 3 student objects
        Student s1 = new Student("Alice", 101, 89.5);
        Student s2 = new Student("Bob", 102, 76.0);
        Student s3 = new Student("Charlie", 103, 92.3);

        // Display their data
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}


