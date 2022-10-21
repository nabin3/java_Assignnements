import java.util.Scanner;

public class Tot20SurArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter side length of cube");
		double a = in.nextDouble();
		double ar = 6 * a * a;
		System.out.println("Total Surface area of cube is = " + ar);
	}
}

