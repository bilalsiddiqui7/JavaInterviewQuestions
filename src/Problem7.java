import java.util.Vector;

public class Problem7 {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
//		int d = 4;
//		int l = arr.length;
//		ArrayList<ArrayList<Integer>> finalArray = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> subArray = new ArrayList<Integer>();
//		for (int i = 0; i < l; i++) {
//			subArray.add(arr[i]);
//			if (subArray.size() == 4) {
//				finalArray.add(subArray);
//				subArray = new ArrayList<Integer>();
//			}
//			if (i == (l - 1) && subArray.size() != 0) {
//				finalArray.add(subArray);
//			}
//		}
//		System.out.println(finalArray);

		System.out.println("\"LIKE\"");
		Vector orderByArg=new Vector();
		orderByArg.add("STATUS_CD");
		for(int i=0;i<orderByArg.size();i++) {
			if(orderByArg.get(i).toString().equals("UPPER(DISPLAY_ORDER)"));
			{
//				orderByArg.set(i, "DISPLAY_ORDER");
				System.out.println("It's a match !!!!");
			}
		}
		
	}
}
