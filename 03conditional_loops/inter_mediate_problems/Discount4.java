		// calculate discount
import java.util.Scanner;

public class Discount4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter sale price and discount rate");
		int sale = in.nextInt();
		float disc = in.nextFloat();
		float eff = sale - (sale * disc / 100);
		System.out.println("Effective price is = " + eff);
	}
}
