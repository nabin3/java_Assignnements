	// distance between two points = square root of ((x2 - x1)^2 - (y2 - y1)^2))

import java.util.Scanner;
import java.lang.Math;

public class Distance5TwoP {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter co-ordinate of first point");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("Enter co-ordinate of second point");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		double dist = Math.sqrt((double)((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)));
		System.out.println("Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") = " + dist);
	}
}
