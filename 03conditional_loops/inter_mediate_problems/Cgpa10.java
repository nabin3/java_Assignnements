	// cgpa = (total_marks_obtained / total_full_marks * 100 ) / 9.5
import java.util.Scanner;

public class Cgpa10 {

        public static void main(String[] ags) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter total marks obtained and full marks");
                float om = in.nextInt();
                int fm = in.nextInt();
                double cg = om / fm * 100 / 9.5;
                System.out.println("CGPA = " + cg);
        }
}
