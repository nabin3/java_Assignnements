		// vlume of cone

import java.util.Scanner;

public class Volume14Cone {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter radious and height of a cone");
		double r = in.nextDouble();
		double h = in.nextDouble();
		double volume = 3.14 * r * r * h / 3;
		System.out.println("Volume of this cone is = " + volume);
	}
}
