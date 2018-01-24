class ExSeven 
{
	public static void main(String[] args) 
	{
		System.out.println("Hi Dinesh");
		System.out.println("Hello Mahesh");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		
	}
}
