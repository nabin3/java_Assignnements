import java.util.Scanner;

public class Pyramid18Volume {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length and width of base for pyramid");
		double l = in.nextDouble();
		double w = in.nextDouble();
		System.out.println("Enter height of pyramid");
		double h = in.nextDouble();
		double v = (l * w * h) / 3;
		System.out.println("Volume of pyramid is = " + v);
	}
}
