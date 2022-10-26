import java.util.Scanner;

public class LCM20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		int l = a;
		while ( l <= a * b) {
			if (l % b == 0)
				break;
			l += a;
		}
		System.out.println("LCM = " + l);
	}
}
