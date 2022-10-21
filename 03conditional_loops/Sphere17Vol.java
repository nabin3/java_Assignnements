		// volume of sphere

import java.util.Scanner;

public class Sphere17Vol {

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radious of the sphere ");
       	        double r = in.nextDouble();
		double vol = (4 * 3.14137 * r * r * r) / 3;
       	        System.out.println("Area of sphere is = " + (3.14137 * r * r));
    }
}
