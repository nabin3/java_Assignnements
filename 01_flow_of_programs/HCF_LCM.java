import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hcf, n1, n2;
        do {
            System.out.println("Enter two numbers");
            n1 = in.nextInt();
            n2 = in.nextInt();
        } while (n1 == 0 && n2 == 0);
        if ( n1 == 0 || n2 == 0)
            hcf = n1 == 0 ? n2 : n1;
        else
            hcf = calHCF(n1 , n2);
        System.out.println("HCF of " + n1 + " & " + n2 + " is = " + hcf);
        System.out.println("LCM of " + n1 + " & " + n2 + " is = " + n1 * n2 / hcf);
    }
    static int calHCF(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return  a;
    }
}
