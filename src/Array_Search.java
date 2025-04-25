public class Array_Search {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int missing = findMissingDigit(numbers);
        System.out.println("The missing digit is: " + missing);
    }

    public static int findMissingDigit(int[] arr) {
        int expectedSum = 0;
        for (int i = 0; i <= 9; i++) {
            expectedSum += i;
        }

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

