class ExEight 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
			System.out.println(10/0);
		}
		catch (NullPointerException)
		{
			System.out.println("Hello World!");
		}
		System.out.println("Bongem Kaadu");
	}
}
