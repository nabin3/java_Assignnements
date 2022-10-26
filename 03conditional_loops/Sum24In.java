			// Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;

public class Sum24In {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n,sum = 0;	
		do {
			System.out.println("Enter integer number");
		        n = in.nextInt();
			sum += n;
		   } while(n != 0);	
		System.out.println("Sum = " + sum);
	}
}
