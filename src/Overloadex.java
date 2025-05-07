import java.util.Scanner;

public class Overloadex {

    void display(int a) {
        System.out.println("You entered an integer: " + a);
    }

    void display(String name) {
        System.out.println("You entered a name: " + name);
    }

    void display(double d) {
        System.out.println("You entered a decimal number: " + d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloadex obj = new Overloadex();

        System.out.println("Enter 1 to input integer, 2 for string, 3 for double:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            obj.display(num);
        } else if (choice == 2) {
            System.out.print("Enter a name: ");
            sc.nextLine();
            String name = sc.nextLine();
            obj.display(name);
        } else if (choice == 3) {
            System.out.print("Enter a decimal number: ");
            double d = sc.nextDouble();
            obj.display(d);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
