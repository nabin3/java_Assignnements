//Input currency in rupees and output in USD.
import java.util.Scanner;
public class Money {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in rupees");
        long amount = input.nextLong();
        System.out.println("Entered amount in USD  is "+amount*76);

    }
}
