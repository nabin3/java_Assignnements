	// Take integer inputs till the user enters 0 and print the largest number from all
	
import java.util.Scanner;

public class Big25In {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int n,big = 0;
                do {
                        System.out.println("Enter integer number");
                        n = in.nextInt();
			if(n > big) {
	                        big = n;
			}
                   } while(n != 0);
                System.out.println("Biggest number = " + big);
        }
}
