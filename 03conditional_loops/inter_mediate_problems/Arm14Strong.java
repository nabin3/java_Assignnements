import java.util.Scanner;

public class Arm14Strong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int nm = in.nextInt();
		int n = nm;
		int d = 0;
		while (n != 0) {
			n /= 10;
			d++;
		}
		boolean c = isArm(nm, d);
		System.out.println("Is " + nm + " an armstrong number? " + c);
	}

	static boolean isArm(int n, int i) {
		int num = n;
		int sum = 0;
		while (num != 0) {
			sum += Math.pow((num % 10), i);
			num /= 10;
		}
		return (n == sum);
	}
}
