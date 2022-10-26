	// n c r = n! / r! * (n - r)!	and    n p r = n! / (n - r)!

import java.util.Scanner;

public class Ncr15Npr {

	public static void main(String[] args) {
		System.out.println("Enter value of N and value R");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		int ncr = fact(n) / (fact(n - r) * fact(r));
		int npr = fact(n) / fact(n - r);
		System.out.println("NCR = " + ncr + " and NPR = " + npr);
	}

	static int fact(int n) {
                if (n == 0 || n == 1) {
                        return (1);
                }
                return (n * fact(n - 1));
        }
}
