class ExSeventeen 
{
	public static void main(String[] args) 
	{
		System.out.println("Code prior to try-catch & finally blocks");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Catch");
		}
		finally
		{
			System.out.println(10/0);
		}
		System.out.println("Code after try-catch & finally blocks");
	}
}
