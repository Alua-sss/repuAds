import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner арқылы енгізу

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter m that should be bigger than n: ");
        int m = sc.nextInt();

        int result = binomialCoefficient(n, m);
        System.out.println("C(" + n + ", " + m + ") = " + result);
    }

    /**
     * This function calculates the binomial coefficient C(n, k) using recursion.
     * It uses the formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = 1 and C(n, n) = 1
     *
     * Time Complexity: O(2^n) in worst case due to repeated recursive calls.
     *
     * @param n the number of elements
     * @param m the number of selections
     * @return the binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int m) {
        if (m == 0 || m == n) return 1;
        return binomialCoefficient(n - 1, m - 1) + binomialCoefficient(n - 1, m);
    }
}
