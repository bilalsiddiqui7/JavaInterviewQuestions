//Write a Java program to check if the two strings are anagrams.
public class InterviewBit98 {
	public static void main(String[] args) throws Exception {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(anagram(s1, s2));
	}

	public static boolean anagram(String s1, String s2) {
		int c = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s1.length(); j++) {
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(j);
					int com = Character.compare(c1, c2);
					if (com == 0) {
						c++;
					}
				}
			}
		}
		if (c == s1.length())
			return true;
		return false;
	}
}
