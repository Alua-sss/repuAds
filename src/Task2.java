import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please, write count of numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            /**
             * This function calculates the average value of the array elements.
             * Runtime: O(n), since we are going through all the elements.
             *
             * @param arr array of numbers
             * @param n number of elements
             * @return average value
             */
        }

        double average = (double) sum / n;
        System.out.println("The average is " + average);
    }
}
