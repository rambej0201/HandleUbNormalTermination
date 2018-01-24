import java.util.*;
class ExTen 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		/*Scanner p = new Scanner(System.in);
		System.out.println("Enter a Name");
		String m = p.nextString(); */
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		try
		{
			System.out.println(10/n);
			System.out.println("Ramu".charAt(20));
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/3);
		}
		catch (StringIndexOutOfBoundsException se)
		{
			System.out.println("Ramu".charAt(2));
		}
	}
}
