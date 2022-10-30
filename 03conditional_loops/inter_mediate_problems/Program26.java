//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Program26 {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int n;
		int ns = 0, pes = 0, pos = 0;
                do {
                        System.out.println("Enter integer number");
                        n = in.nextInt();
                        if(n > 0) {
                                if (n % 2 == 0) {
					pes += n;
				}
				else {
					pos += n;
				}
                        }
			else {
				ns += n;
			}
                   } while(n != 0);
                System.out.println("Sum of -ve numbers = " + ns + "\nSum of +ve even numbers = " + pes + "\nSum of +ve odd numbers = " + pos);
        }
}
