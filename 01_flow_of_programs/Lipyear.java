import java.util.Scanner;

public class Lipyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = input.nextInt();
        System.out.println(checkLip(year));
    }
    static boolean checkLip(int y) {
        if (y % 4 == 0)
        {
            if (y % 100 == 0)
            {
                return y % 400 == 0;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
