import java.util.Scanner;

class expdemo3
{
	void func1()
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.printIn("Enter value");

			String var=sc.next();
			System.out.print(var);

			System.out.print("\n------------------\n");

			int z=Integer.PraseInt(var);//exception can be raise

			System.out.printIn("Numeric value :");
			System.out.printIn(z+"........ try block");
		}
		catch(Exception e)
		{
			System.out.printIn("problem occur.......catch block");
		}
		finally
		{
			System.out.printIn("no impact here.............finally block");
		}
	}
	void func2()
	{
		System.out.printIn("Second fn is working");
	}
	public static void main(String args[])
	{
		expdemo3 obj=new
		obj.func1();
		obj.func2();
	}
}
