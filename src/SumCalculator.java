import java.util.Scanner;

public class SumCalculator {
    void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumCalculator obj = new SumCalculator();

        System.out.println("Choose an option:");
        System.out.println("1. Sum of two integers");
        System.out.println("2. Sum of three integers");
        System.out.println("3. Sum of two doubles");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                obj.sum(x, y);
                break;

            case 2:
                System.out.print("Enter three integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                obj.sum(a, b, c);
                break;

            case 3:
                System.out.print("Enter two double values: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                obj.sum(d1, d2);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

