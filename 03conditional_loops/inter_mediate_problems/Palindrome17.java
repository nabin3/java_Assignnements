import java.util.Scanner;

public class Palindrome17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		int number = 0;
		int t = num;
		while (t != 0) {
			int r = t % 10;
			number = number * 10 + r;
			t /= 10;
		}
		System.out.println(num + " is palindrome : " + (num == number));
	}
}
