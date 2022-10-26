		// commision percentage = (original_price - effective_price) / original price * 100
import java.util.Scanner;

public class Commis6Per {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is original price ?");
		float op = in.nextFloat();
		System.out.println("What is effective rice ?");
		float ep = in.nextFloat();
		float com = (op - ep) * (100 / op);
		System.out.println("Commission = " + com + "%");
	}
}
