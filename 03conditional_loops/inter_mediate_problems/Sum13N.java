import java.util.Scanner;

public class Sum13N {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter how many number");
		int n = in.nextInt();
		int sum = 0;
		while (n != 0) {
	        	sum += n;
			n--;
		}
		System.out.println("Sum = " + sum);
	}
}
