import java.util.Scanner;

public class String16Reverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String os = in.next();
		String n = "";
		for(int i = 0; i <os.length(); i++) {
			char ch = os.charAt(i);
			n = ch + n;
		}
		System.out.println("After reversing " + n);
	}
}
