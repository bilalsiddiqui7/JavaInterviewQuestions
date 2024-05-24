//Write a Java Program to find the factorial of a given number.
public class InterviewBit99 {
	public static void main(String[] args) throws Exception {
		int n = 7;
		int res=fact(n);
		System.out.println(res);
	}
	public static int fact(int n) {
		int fac = 1;
		while (n > 0) {
			fac = fac * n;
			n -= 1;
		}
		return fac;
	}
}
