//FIND MISSING ELEMENT FROM AN ARRAY, CAN BE ONE EMENET OR MORE THAN ONE ELEMENTS MISSING
public class Problem2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,8,9,10,11,13,15};
		int diff=arr[1]-arr[0];
		int c=0;
		for(int i:arr) {
			c+=diff;
			if(i!=c) {
				System.out.println(c);
				c+=diff;
			}
		}
	}
}
