import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int count = scanner.nextInt();
        System.out.println(count + " Enter numbers to revers :");
        printReverse(count, scanner);
    }
    /**
     * This recursive function reads N numbers from the user and outputs them in reverse order.
     * Does not use arrays or other data structures.
     *
     * Time complexity: O (n) because each number is read once and reproduced once.
     *
     * @ param sc Scanner object to read input from user.
     */

    public static void printReverse(int count, Scanner scanner) {
        if (count == 0) {
            return;
        }
        int number = scanner.nextInt();
        printReverse(count - 1, scanner);
        System.out.print(number + " ");
    }
}
