		// perimeter of square

import java.util.Scanner;

public class Square12Peri {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of side");
		double a = in.nextDouble();
		double p = 4 * a;
		System.out.println("Perimeter of square = " + p);
	}
}
