	// perimeter of parallelogram
import java.util.Scanner;

public class Parallelogram11Perimeter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter two sides of rectangle");
		double l = in.nextDouble();
		double w = in.nextDouble();
		double p = 2 * (w + l);
		System.out.println("Perimeter of parallelogram = " + p);
	}
}
