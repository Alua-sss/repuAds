import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("enter n!:   ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result=factorial(n);
        System.out.println("factorial is: "+result);
    }
    /**
     * Function that computes the factorial by recursion
     * @param n-the number entered
     * @ return - n factorial
     * Time complexity: O(n)
     */
    public static int factorial(int n) {
        if (n==1) {return 1;}
        return factorial(n-1)*n;
    }
}
