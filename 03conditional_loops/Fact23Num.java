	// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Fact23Num {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		System.out.println("Factors are = ");
		for (int i = 1; i <= num; i ++) { 
			if (num % i == 0) {
				System.out.print(" " + i);
			}
		}
	}
}
