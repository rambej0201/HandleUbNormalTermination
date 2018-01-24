class ExFifteen 
{
	public static void main(String[] args) 
	{
		System.out.println("Code prior to try-catch & finally blocks");
		try
		{
			System.out.println(10/0);
		}
		catch (NullPointerException e)
		{
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Code after try-catch & finally block");
	}
}
