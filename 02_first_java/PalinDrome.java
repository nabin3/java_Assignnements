import java.util.Scanner;

import static java.lang.Math.pow;

public class PalinDrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = in.nextInt();
        int tempc= number;
        int c = 0; 
        int dig = 0;
        int temp = number;
        while(temp != 0){
            temp /= 10;
            c++;
        }
        c -= 1;
        while(tempc != 0){
            int r = tempc % 10;
            dig += r * (int) pow(10, c);
            c--;
            tempc = tempc / 10;
        }
        if(number == dig)
            System.out.println("This number is a Palindrome number");
        else
            System.out.println("This number is not a palindrome number");
    }
}
