import java.util.Scanner;

public class Sorting {
    public static void sortByASCII(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        sortByASCII(chars);
        System.out.println("Sorted by ASCII: " + new String(chars));

        scanner.close();
    }
}

