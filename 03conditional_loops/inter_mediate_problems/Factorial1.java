import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =in.nextInt();
		int fac = calFact(num);
		System.out.println("Factorial of " + num + " = " + fac);
	}
	
	static int calFact(int n) {
		if (n == 0 || n == 1) {
			return (1);
		}
		return (n * calFact(n - 1));
	}
}
