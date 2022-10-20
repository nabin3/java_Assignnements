// To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit of fibonacci series: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The Fibonacci series of " + n + " term is :");
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(a);
            System.out.println(b);
            while (n > 2)
            {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                n--;
            }
        }
    }
}