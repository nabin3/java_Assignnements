// [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.](https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

public class Max1Min {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int mx = max(a,b,c);
		int mn = min(a,b,c);
		System.out.println("Maximum nuber = " + mx + "\nMinimum nuber = " + mn);
	}

	static int max(int a, int b, int c) {
		return (a > b? (a > c? a: c): (b > c? b: c));
	}

	static int min(int a, int b, int c) {
		return (a < b? (a < c? a: c): (b < c? b: c));
	}
}
