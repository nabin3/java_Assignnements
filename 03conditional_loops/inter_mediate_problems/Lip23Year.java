public class Lip23Year {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		System.out.println(year + " is a LipYear : " + isLip(year));
	}

	static boolean isLip(int y) {
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				return (y % 400 == 0);
			} else {
				return true;
			}
		}
		else {
			return false;
		}	
	}
}
