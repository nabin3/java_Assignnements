		// q6 area of rohmbus
import java.util.Scanner;

public class Area_06Rohmbus {
	
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter two diagonals");
		double d1 = in.nextDouble();
		double d2 = in.nextDouble();
		double a = d1 * d2 / 2;
		System.out.println("Area of the rohmbus is = " + a);
	}
}
