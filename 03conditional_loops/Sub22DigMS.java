	// [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

public class Sub22DigMS {

	public static void main(String[] args) {

		int num = 4763, sum = 0, mul = 1;
		while (num > 0) {
			sum += num % 10;
			mul *= num % 10;
			num /= 10;
		}
		System.out.println("Subtraction of the Product and Sum of Digits is = " + (mul - sum));
	}
}
