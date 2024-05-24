// Write a Java Program to print Fibonacci Series using Recursion.
public class InterviewBit97 {
	public static void main(String[] args) {
		fibonacciRecurrsion(0, 1, 7);
	}

	private static String fibonacciRecurrsion(int n1, int n2, int i) {
		if (i == 0) {
			return null;
		}
		if (i == 7) {
			System.out.println(0);
		} else if (i == 6) {
			System.out.println(1);
		} else {
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		return fibonacciRecurrsion(n1, n2, i - 1);
	}
}
