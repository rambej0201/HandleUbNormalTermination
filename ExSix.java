class ExSix 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Tyson");
		System.out.println("Hello Tyson");
		try{
		System.out.println(10/0);
		}
		//10/0 generates airthematic exception
		catch(ArithmeticException ae)
		{
			System.out.println(10/3);
		}
		System.out.println("rest of the code");
		

	}
}
