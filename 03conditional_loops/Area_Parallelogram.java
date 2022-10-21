	// area of parallelogram
import java.util.Scanner;

public class Area_Parallelogram {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter height of parallelogram");
		double h = in.nextDouble();
		System.out.println("Enter base of parallelogram");
		double b = in.nextDouble();
		double area = h * b;
		System.out.println("Area of this triangle is = " + area);
	}
}
		
