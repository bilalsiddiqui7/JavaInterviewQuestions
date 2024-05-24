//Write a Java program to create and throw custom exceptions.

class MyException extends Exception{
	public MyException(String errorMessage) {
		super(errorMessage);
	}
}
public class InterviewBit102 {
	public static void main(String[] args) throws MyException {
		String errorMessage = "This is my Exception";
		throw new MyException(errorMessage);
	}
}
