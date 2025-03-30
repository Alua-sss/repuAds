import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // base number
        int m = sc.nextInt(); // exponent

        int result = dareje(n, m); // call the recursive function
        System.out.println("result: " + result);
    }

    // Recursive function to calculate n raised to the power of m (n^m)
    public static int dareje(int n, int m) {
        if (m == 0) {
            return 1; // base case: anything to the power of 0 is 1
        }
        return n * dareje(n, m - 1); // recursive call: n^m = n * n^(m-1)

        /*
         * Time Complexity: O(m)
         * Because the function calls itself m times.
         */
    }
}
