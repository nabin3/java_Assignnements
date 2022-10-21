import java.util.Scanner;

public class Curved19Cylinder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radious of cylinder");
		double r = in.nextDouble();
		System.out.println("Enter height of cylinder");
		double h = in.nextDouble();
		double a = 2 * 3.14137 * r * h;
		System.out.println("Volume of pyramid is = " + a);
	}
}

