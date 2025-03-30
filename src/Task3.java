import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n, 2)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Composite");
        }
    }

    // This function checks if a number is prime using recursion
    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false; // numbers less than or equal to 1 are not prime
        if (i * i > n) return true; // no divisor found, so it's prime
        if (n % i == 0) return false; // found a divisor, so not prime
        return isPrime(n, i + 1); // check next number

        /**
         * Time Complexity: O(√n)
         * We only check up to the square root of the number.
         */
    }
}
