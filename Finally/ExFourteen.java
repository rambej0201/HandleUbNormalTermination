class ExFourteen 
{
	public static void main(String[] args) 
	{
		System.out.println("Code prior to Try-Catch & Finally blocks");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Code after try-catch & finally block");
	}
}
