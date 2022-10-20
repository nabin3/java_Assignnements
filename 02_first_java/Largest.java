//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        long n1 = in.nextLong();
        long n2 = in.nextLong();
        if(n1 > n2){
            System.out.print(n1 + " is largest number  ");
        }else
        {
            System.out.print(n2 + " is largest number");
        }
    }
}
