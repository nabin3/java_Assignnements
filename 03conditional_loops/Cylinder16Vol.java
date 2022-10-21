		// volume of cylinder

import java.util.Scanner;

public class Cylinder16Vol {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.println("Enter radious and height of cylinder");
                double ra = in.nextDouble();
                double hi = in.nextDouble();
                double vol = 3.14 * ra * ra * hi; 
                System.out.println("Volume of prism is = " + vol);
        }
}
