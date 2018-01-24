import java.util.*;
class ThrowOne 
{
	static void status(int age){
		if(age > 20){
			System.out.println("Eligible for marriage");
		}
		else {throw new ArithmeticException("not eligible / by zero");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		new ThrowOne.status(age);
	}
}
