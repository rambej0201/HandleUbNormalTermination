class ExThirteen 
{
	public static void main(String[] args)
	{
		System.out.println("Code prior to try-catch & finally blocks");
		try
		{
			System.out.println("try");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Code after try-catch and finally blocks");
	}
}
