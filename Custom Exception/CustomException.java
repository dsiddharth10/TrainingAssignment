public class CustomException extends Exception
{
	public CustomException(String mess)
	{
		super(mess);
		System.out.println("custom exception");
	}
}
