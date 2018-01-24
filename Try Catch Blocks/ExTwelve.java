import java.util.*;
class ExTwelve 
{
	public static void main(String[] args) 
	{
		System.out.println("Code before exceptions");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		try
		{
			System.out.println(10/n);
			System.out.println("Hello World!".charAt(20));
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Hello World!-Arithmmetic Exception");
		}
		catch (Exception ee){
			System.out.println("Hello World!-Other All Exceptions");
		}
		System.out.println("Code after exceptions");
	}
}
