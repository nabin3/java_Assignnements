import java.util.Scanner;

public class Sumx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String num = in.next();
            if (num.charAt(0) == 'x') {
                break;
            } else {
                sum += Integer.parseInt(num);
            }
        }
        System.out.print("sum = " + sum);
    }
}
