// calculate simple interest from principle amount,time and interest rate
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle amount,time and year in order: ");
        long amount = input.nextLong();
        int time = input.nextInt();
        double rate = input.nextDouble();
        System.out.println("Simple interest = "+ (amount * time * rate) / 100);

    }
}
