//BINARY SEARCH
public class Problem3 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 23, 45, 67, 89, 100, 123, 345, 678 };
		int search = 100;
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (search > arr[mid]) {
				start = mid + 1;
			} else if (search < arr[mid]) {
				end = mid - 1;
			} else if (arr[mid] == search) {
				System.out.println(mid);
				break;
			}
		}
	}
}
