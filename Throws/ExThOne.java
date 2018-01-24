class ExThOne 
{
	void mro() throws InterruptedException ie
	{
		System.out.println("Sleeping Mode");
		try{Thread.sleep(3000);} //3 seconds
		catch(InterruptedException ie)
		{ie.printStackTrace();}
		System.out.println("Sleeping Mode Again");
		
	}
	void mofficer()
	{
		mro();
	}
	void eseva()
	{
		mofficer();
	}
	public static void main(String[] args) 
	{
		ExThOne e = new ExThOne();
			e.eseva();
	}
}
