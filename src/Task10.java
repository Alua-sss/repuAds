import java.util.Scanner;
public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }

    /**
     * This function finds the greatest common denominator (GCD) of two numbers.
     * Uses the Euclidean algorithm by recursion.
     * For example, gcd(32, 48) → 16
     *
     * Time complexity: O (log (min (a, b)))
     *
     * @param a first number
     * @param b second number
     * @return EIC (GCD)of numbers a and b
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
