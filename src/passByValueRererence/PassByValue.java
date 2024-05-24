package passByValueRererence;

public class PassByValue
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.setName("Wagon R");
		System.out.println("Before, the value of c is " + c.getName());
		changeCarName(c);
		System.out.println("After, the value of c is " + c.getName());
	}

	public static void changeCarName(Car c)
	{
		//WE ARE NOW CREATING A NEW OBJECT FOR CAR, SO NOW IT IS POINTING TO DIFFERENT ADDRESS IN 
//		THE MEMORY 
		c = new Car();
		c.setName("Dizire");
	}
}