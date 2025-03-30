import java.util.Scanner;

public class Task5 {

    /**
     * This is the main method that reads input from the user
     * and calls the recursive Fibonacci function.
     */
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }

    /**
     * This function calculates the nth Fibonacci number using recursion.
     *
     * Time Complexity: O(2^n), because the function calls itself twice
     * for each non-base case, leading to an exponential number of calls.
     *
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}