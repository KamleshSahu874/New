import java.util.Scanner;
import java.util.HashMap;

public class Attendance1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        HashMap<Integer, Boolean> attendance = new HashMap<>();
        int rollNumber = 1;
        int choice;

        do {
            System.out.println("\n--- Student Attendance System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.put(rollNumber, name);
                    attendance.put(rollNumber, false); // default absent
                    System.out.println("Student added with Roll Number: " + rollNumber);
                    rollNumber++;
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students to mark attendance.");
                    } else {
                        for (int rn : students.keySet()) {
                            System.out.print("Is " + students.get(rn) + " (Roll No: " + rn + ") present? (y/n): ");
                            String input = scanner.nextLine();
                            attendance.put(rn, input.equalsIgnoreCase("y"));
                        }
                        System.out.println("Attendance marked successfully.");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        System.out.println("\n--- Attendance Report ---");
                        for (int rn : students.keySet()) {
                            String status = attendance.get(rn) ? "Present" : "Absent";
                            System.out.println("Roll No: " + rn + " | Name: " + students.get(rn) + " | Status: " + status);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
