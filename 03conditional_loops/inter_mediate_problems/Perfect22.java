		// perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. For instance, 6                    has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number 

//import java.util.Scanner;

public class Perfect22 {
	public static void main(String[] args) {
		//System.out.println("Enter a number");
		//Scanner in = new Scanner(System.in);
		//int num = in.nextInt();
		int num = Integer.parseInt(args[0]);
		int i = 2;
		int sum = 1;
		while (i < num) {
			if (num % i == 0) {	
				sum += i;
			}
			i++;
		}
		System.out.println(num + " is an Perfect number :" + (sum == num));
	}
}
