//Check if a given string is palindrome using recursion.
public class InterviewBit96 {
	public static void main(String[] args) {
		boolean res = palindrome("hello");
		System.out.println(res);

	}

	public static boolean palindrome(String s) {
		String og = s;
		String rev = reverse(s);
		if (rev.equals(og)) {
			return true;
		}
		return false;
	}

	public static String reverse(String str) {
		int l = str.length();
		if (str.length() == 0) {
			return str;
		}
		return str.charAt(l - 1) + reverse(str.substring(0, l - 1));
	}
}
