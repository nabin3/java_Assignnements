import java.util.Scanner;

public class Vowel21Consonent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter");
		String s = in.next();
		char ch = s.charAt(0);
		switch(ch) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Vowel");
				  break;
			default : System.out.println("Consonent");
		}
	}
}

