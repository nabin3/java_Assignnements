		// volume of prism

import java.util.Scanner;

public class Prism15Vol {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter width and length of the base of the prism");
		double wi = in.nextDouble();
		double le = in.nextDouble();
		double baseA = wi * le;
		System.out.println("Enter height of the prism");
		double h = in.nextDouble();
		double vol = baseA * h;
		System.out.println("Volume of prism is = " + vol);
	}
}
