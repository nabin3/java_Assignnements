import java.util.Scanner;

import static java.lang.Math.pow;


public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        double number = in.nextDouble();
        double sum = 0;
        double temp = number;
        while(temp != 0){
            double r = temp % 10;
            sum = sum + pow(r,3);
            temp = temp / 10;
        }
        if(sum == number)
            System.out.println("This number is an Armstrong number");
        else
            System.out.println("This number is not an armstrong number");
    }
}
