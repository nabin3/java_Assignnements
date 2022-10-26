import java.util.Scanner;

public class Mark12Av {

        public static void main(String[] ags) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter total marks obtained and no. of subjects");
                float tm = in.nextInt();
                int s = in.nextInt();
                double ag = tm / s;
                System.out.println("Average marks = " + ag);
        }
}
