import java.util.Scanner;

public class Power7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base and power");
		int b = in.nextInt();
		int p = in.nextInt();
		long r = exp(b, p);
		System.out.println(b + " ^ " + p + " = " + r);
	}
	
	static long exp(int b, int p) {
		long re = 1;
		if (p == 0) {
			return 1;
		}
		while (p >= 1) {
			re *= b;
			p--;
		}
		return re;
	}
}
