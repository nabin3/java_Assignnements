	// depriciation value per year

import java.util.Scanner;

public class Depriciation8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter original price");
		float op = in.nextFloat();
		System.out.println("Enter depriciation rate");
		float r = in.nextFloat();
		System.out.println("For how many years you want to calculate depriciation cost ?");
		float t = in.nextFloat();
		float dc = depCost(op, r, t);
		System.out.println("Depriciation cost after " + t + " years = " + dc);
	}
	
	static float depCost(float op, float r, float t) {

		float re = (float)(op * Math.pow((1 - r / 100) , t));
		return (re);
	}
}
