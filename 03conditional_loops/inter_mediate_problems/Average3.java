		// average of three numbers
import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println("Average of " + a + ", " + b + ", " + c + " is = " + (float)(a + b + c) / 3);
	}
}
