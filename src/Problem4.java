//Find missing elements from given two arrays.
public class Problem4 {
	public static void main(String[] args) {
		
		int[] arr1= {12,34,54,76,89,765,23,55};
		int[] arr2= {12,34,20,76,89,765,30,55};
		
		for(int i=0;i<arr2.length;i++) {
			int j;
			for(j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					break;
				}	
			}
			if(j==arr1.length)
				System.out.println(arr2[i]);
		}		
		
	}
}
//int[] arr1 = { 2, 54, 76543, 65, 76, 8797, 24 };
//int[] arr2 = { 24, 2, 76, 65, 8797, 1, 1 };
//for (int i = 0; i < arr1.length; i++) {
//	int j;
//	for (j = 0; j < arr2.length; j++) {
//		if (arr1[i] == arr2[j]) {
//			break;
//		}
//	}
//	if (j == arr2.length)
//		System.out.println(arr1[i]);
//}