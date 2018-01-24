import java.util.*;
class ExEleven 
{
	public static void main(String[] args) 
	{
		System.out.println("Code prior to exceptions");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		try
		{
			System.out.println(10/n);
			System.out.println("Hello World!".charAt(50));
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Me llamo Raghu-ArithmeticException");
		}
		catch (StringIndexOutOfBoundsException se)
		{
			System.out.println("Naa peru Raghu-StringIndexOutOfBoundsException");
		}
		System.out.println("Migilina application code");
	}
}
