public class ExcepTest
{
	public int sqr(int num)throws CustomException
	{
		if(num<=0)
		{
			throw new CustomException("Zero or negative not allowed");
		}
		return num;
	}
}