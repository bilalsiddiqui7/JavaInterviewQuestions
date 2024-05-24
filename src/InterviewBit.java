

////Given an array of non-duplicating numbers from 1 to n where one number is missing,
////write an efficient java program to find that missing number.
//public class InterviewBit {
//	public static void main(String[] args) {
//		int[] arr = { 1, 3, 8, 7, 5, 2, 6 };
//		int res = missingNum(arr);
//		System.out.println(res);
//	}
//
//	private static int missingNum(int[] arr) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		int largest = arr[arr.length - 1];
//		int sumOfArray = 0;
//		for (int i = 1; i <= largest; i++) {
//			sumOfArray += i;
//		}
//		int sumOfOgArray = 0;
//		for (int i : arr) {
//			sumOfOgArray += i;
//		}
//		return sumOfArray - sumOfOgArray;
//	}
//}

////Write a Java Program to check if any number is a magic number or not.
////A number is said to be a magic number if after doing sum of digits in each 
////step and inturn doing sum of digits of that sum, the ultimate result 
////(when there is only one digit left) is 1.
////Step 1: 163 => 1+6+3 = 10
////Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number
//public class InterviewBit {
//	public static void main(String[] args) {
//		int num = 12345;
//		boolean res = magicNum(num);
//		System.out.println(res);
//	}
//
//	private static boolean magicNum(int num) {
//		// TODO Auto-generated method stub
//
//		int sum = 0;
//		while (num > 0 || sum > 9) {
//			if (num == 0) {
//				num = sum;
//				sum = 0;
//			}
//			int last = num % 10;
//			num = num / 10;
//			sum += last;
//		}
//		System.out.println(sum);
//		return (sum==1);
//	}
//}

////Write a Java program to create and throw custom exceptions.
//class CustomException extends Exception {
//	public CustomException(String s) {
//		super(s);
//	}
//}
//public class InterviewBit {
//	public static void main(String[] args) throws CustomException  {
//		throw new CustomException("This is my custom exception");
//	}
//}

////Check if a given string is palindrome using recursion.
//public class InterviewBit {
//	public static void main(String[] args) {
//		String str = "bob";
//		String res = palindromeRecursion(str);
//		System.out.println("The string is " + res.equals(str));
//	}
//
//	private static String palindromeRecursion(String str) {
//		int l = str.length();
//		if (str.length() == 0) {
//			return str;
//		}
//		return str.charAt(l - 1) + palindromeRecursion(str.substring(0, l - 1));
//	}
//}

//// Write a Java Program to print Fibonacci Series using Recursion.
////0 1 1 2 3 5 8
//public class InterviewBit {
//	public static void main(String[] args) {
////		fibonacci(7);
//		fibonacciRecurrsion(0, 1, 7);
//	}
//
////	private static void fibonacci(int i) {
////		int n1 = 0;
////		int n2 = 1;
////		System.out.println(n1);
////		System.out.println(n2);
////		for (int j = 2; j < i; j++) {
////			int n3 = n1 + n2;
////			System.out.println(n3);
////			n1 = n2;
////			n2 = n3;
////		}
////	}
//
//	private static String fibonacciRecurrsion(int n1, int n2, int i) {
//		if (i == 0) {
//			return null;
//		}
//		if (i == 7) {
//			System.out.println(0);
//		} else if (i == 6) {
//			System.out.println(1);
//		} else {
//			int n3 = n1 + n2;
//			System.out.println(n3);
//			n1 = n2;
//			n2 = n3;
//		}
//		return fibonacciRecurrsion(n1, n2, i - 1);
//	}
//}

////Write a Java program to check if the two strings are anagrams.
//public class InterviewBit {
//	public static void main(String[] args) {
//		String str1 = "acbd";
//		String str2 = "dabc";
//		boolean res = anagram(str1, str2);
//		System.out.println("The given two strings are " + res);
//	}
//
//	private static boolean anagram(String str1, String str2) {
//		if (str1.length() != str2.length()) {
//			return false;
//		}
//		char[] arrStr1 = sortString(str1);
//		char[] arrStr2 = sortString(str2);
//		if (Arrays.toString(arrStr1).equals(Arrays.toString(arrStr2))) {
//			return true;
//		}
//		return false;
//	}
//
//	private static char[] sortString(String str) {
//		int l = str.length();
//		char[] arr = str.toCharArray();
//		for (int i = 0; i < l; i++) {
//			for (int j = 0; j < l; j++) {
//				if (arr[i] < arr[j]) {
//					char temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		return arr;
//	}
//}

////Write a Java Program to find the factorial of a given number.
//public class InterviewBit {
//	public static void main(String[] args) {
//		int res = factorial(7);
//		System.out.println(res);
//	}
//
//	private static int factorial(int i) {
//		int fact = 1;
//		for (int j = 1; j <= i; j++) {
//			fact = fact * j;
//		}
//		return fact;
//	}
//}

