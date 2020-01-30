import java.util.Scanner;
public class UseCustomException
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		ExcepTest e =new ExcepTest();
		int result=0;
        System.out.println("Enter a positive number");
        int num = sc.nextInt();
        try
		{
			result=e.sqr(num);
			System.out.println(result);
		}
		catch(CustomException m)
		{
			System.out.println(m);
		}
		System.out.println("Done");
	}
}
		