	// p(1 + r / 100) ^ t
import java.util.Scanner;

public class Compound11Interest {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter principal amount");
                float p = in.nextFloat();
                System.out.println("Enter interest rate");
                float r = in.nextFloat();
                System.out.println("For how many years you want to calculate interest ?");
                float t = in.nextFloat();
                float ip = inPrin(p, r, t);
                System.out.println("Total amount with interest after " + t + " years = " + ip);
        }

        static float inPrin(float op, float r, float t) {

                float re = (float)(op * Math.pow((1 + r / 100) , t));
                return (re);
        }
}
