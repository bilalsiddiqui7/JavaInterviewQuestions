//Write a Java Program to check if any number is a magic number or not.
//A number is said to be a magic number, if the sum of its digits are calculated till
//a single digit recursively by adding the sum of the digits after every addition. 
//If the single digit comes out to be 1,then the number is a magic number
//Step 1: 163 => 1+6+3 = 10
//Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number
public class InterviewBit101 {
	public static void main(String[] args) {
		boolean res = findMagicNumber(163);
		System.out.println(res);
	}

	private static boolean findMagicNumber(int n) {
		int sum = 0;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			int last1 = n % 10;
			n = n / 10;
			sum += last1;
		}

		if (sum == 1) {
			return true;
		}
		return false;
	}
}
