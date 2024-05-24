package passByValueRererence;

// THE VALUE OF c1 IS ALSO CHANGED AFTER CHANGING THE VALUE OF c2 BECAUSE c1 AND c2
// ARE POINTING TO THE SAME ADDRESS

class Car
{
	String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}

public class PassByReference
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.setName("Wagon R");
		System.out.println("Before, the value of c is " + c.getName());
		changeCarName(c);
		System.out.println("After, the value of c is " + c.getName());
	}

//	IT MAY LOOK LIKE WE ARE PASSING THE REFERENCE BUT ACTUALLY WE ARE PASSING THE MEMORY ADDRESS OF
//	THAT PARTICULAR OBJECT
	public static void changeCarName(Car c)
	{
		c.setName("Dizire");
	}

}