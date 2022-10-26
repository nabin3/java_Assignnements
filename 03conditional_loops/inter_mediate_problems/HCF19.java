import java.util.Scanner;

public class HCF19 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		while (a != b) {
		    if (a > b){
			a -= b;	
                    }
		    else {
			b -= a;
		    }
		}
		System.out.println("HCF = " + a);
	}
}
