	// future value = present value * (1 + interest_rate / 100) ^ time

import java.util.Scanner;

public class Future18In {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter present value");
                double p = in.nextDouble();
                System.out.println("Enter interest rate");
                float r = in.nextFloat();
                System.out.println("For how many years you want to calculate investment value ?");
                float t = in.nextFloat();
                double ip = inPrin(p, r, t);
                System.out.println("Total amount with interest after " + t + " years = " + ip);
        }

        static double inPrin(double op, float r, float t) {

                return ((op * Math.pow((1 + r / 100) , t)));
        }
}
