// Take in two numbers and an operator (+, -, *, /) and calculate the value.
import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        long n1 = Long.parseLong(args[0]);
        long n2 = Long.parseLong(args[1]);
        System.out.println("Enter any operation from + , - , * , / : ");
        String operator = op.next();
        if(operator.equals("+")) {
            System.out.print("Addition = " + (n1 + n2));
        }
        if(operator.equals("-")) {
            System.out.print("Subtraction = " + (n1 - n2));
        }
        if(operator.equals("*")) {
            System.out.print("Multiplication = " + (n1 * n2));
        }
        if(operator.equals("/")) {
            System.out.print("Division = " + (n1 / n2));
        }

    }
}
