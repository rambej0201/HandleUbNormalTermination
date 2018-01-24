import java.util.*;
class ExNine 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		System.out.println("Hello Room");
		System.out.println("Hello Bhai");
		try
		{
			System.out.println(10/n);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Rest of the code");
	}
}
