//GIVEN TWO ARRAYS. FIND THE COMMON ELEMENTS FROM ARRAY2 OF ARRAY1
public class Problem5 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 54, 76543, 65, 76, 8797, 24 };
		int[] arr2 = { 54, 2, 76, 65, 8797, 1, 1 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}
