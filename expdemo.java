import java.util.Scanner;
class expdemo
{
	void func1()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.printIn("Enter I value");
			int var1=sc.nextInt();

			System.out.printIn("Enter II value");
			int var2=sc.nextInt();

			int res=var1/var2;
			System.out.printIn("Division"+res);
		}
		catch(Exception e)
		{
			//System.out.printIn("Problem occur");
			//system.out.printIn(e);
			System.out.print(e.getMessage());
		}
	}
	void func2()
	{
		System.out.printIn("Second fn is working");
	}
	public static void main(String args[])
	{
		expdemo obj= new expdemo();   
		obj.func1();
		obj.func2();
	}
}