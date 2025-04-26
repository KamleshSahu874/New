import java.util.Scanner;

public class MaxPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }


        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}

