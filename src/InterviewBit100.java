//Given an array of non-duplicating numbers from 1 to n where one number is missing,
//write an efficient java program to find that missing number.
public class InterviewBit100 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 8, 7, 5, 2, 6 };
		int res = findMissingNum(arr);
		System.out.println("Missing number is " + res);
	}

	public static int findMissingNum(int[] arr) {
		int l = arr.length + 1;
		int sumOfnNaturalNumbers = l * (l + 1) / 2;
		int sumOfArr = 0;
		for (int a : arr) {
			sumOfArr += a;
		}
		return sumOfnNaturalNumbers - sumOfArr;
	}
}
