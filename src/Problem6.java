import java.util.*;


public class Problem6 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> flatArr = new ArrayList<Integer>();
		for (int[] i : arr) {
			for (int j : i) {
				flatArr.add(j);
			}
		}
		System.out.println(flatArr);
	}
}
