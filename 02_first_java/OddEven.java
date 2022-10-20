import java.util.Scanner;

                        //Write a program to print whether a number is even or odd,also take input from user
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        long number = input.nextLong();
        if(number % 2 == 0)
            System.out.print("The number,you gave is an even number.");
        else
            System.out.print("The number,you gave is an odd number.");
    }
}
