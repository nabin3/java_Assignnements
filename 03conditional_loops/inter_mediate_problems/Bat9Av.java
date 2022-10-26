	// batting average = total score / total number of outs

import java.util.Scanner;

public class Bat9Av {

	public static void main(String[] ags) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total score and total number of out");
		float sc = in.nextInt();
		int out = in.nextInt();
		float av = sc / out;
		System.out.println("Batting average = " + av);
	}
}
