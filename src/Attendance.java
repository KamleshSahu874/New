import java.util.Scanner;
import java.util.HashMap;

public class Attendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        String[] students = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
        HashMap<String, String> attendance = new HashMap<>();
        System.out.println("\nMark attendance (y for present / n for absent):");
        for (String student : students) {
            System.out.print("Is " + student + " present? (y/n): ");
            String input = scanner.nextLine().toLowerCase();
            attendance.put(student, input.equals("y") ? "Present" : "Absent");
        }
        System.out.println("\nAttendance Record:");
        for (String student : students) {
            System.out.println(student + ": " + attendance.get(student));
        }

        scanner.close();
    }
}

