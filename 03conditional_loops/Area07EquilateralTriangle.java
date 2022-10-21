import java.util.Scanner;

public class Area07EquilateralTriangle {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of triangle");
		double s = in.nextDouble();
		double area = 1.732 / 4 * s * s;
		System.out.println("Area of triangle = " + area);
	}
}
