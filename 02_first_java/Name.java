// take a name as input and print a greeting msg for that name
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String alias = in.nextLine();
        System.out.print("Welcome "+alias);
    }
}
