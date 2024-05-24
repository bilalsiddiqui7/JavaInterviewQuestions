interface Permission {

}

class Impl implements Permission {
	public void demo() {
		System.out.println("Permission granted");
	}
}

public class MarkerInterface {
	public static void main(String[] args) {
		Impl obj = new Impl();
		if (obj instanceof Permission) {
			obj.demo();
		} else {
			System.out.println("Permission not granted");
		}
	}
}
