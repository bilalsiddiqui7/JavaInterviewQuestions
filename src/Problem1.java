import java.util.HashMap;

//BY USING HASHMAP
public class Problem1 {
public static void main(String[] args) {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	String str1 = "aaddffgghhjj";
	for (int i = 0; i < str1.length(); i++) {
		char c = str1.charAt(i);
		int val;
		if (map.containsKey(c)) {
			val = map.get(c);
			map.put(c, val + 1);
		} else {
			map.put(c, 1);
		}
	}
	System.out.println(map);
}
}

//public class Problem1 {
//	public static void main(String[] args) {
//		String str1 = "Bilal";
//		char[] arr1 = str1.toCharArray();
//		int count = 0;
//		for (char a : arr1) {
//			if (a == 'l')
//				count++;
//		}
//		System.out.println(count);
//	}
//	
//
//}

