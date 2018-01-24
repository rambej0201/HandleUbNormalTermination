class ExSixteen 
{
	public static void main(String[] args) 
	{
		System.out.println("Code prior to exception");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Finally");
		}

		System.out.println("Codeafter try-catch & finally blocks");
	}
}
