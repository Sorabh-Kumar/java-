import java.util.scanner;

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

			int z=Integer.praseInt(var);//exception can be raise

			System.out.printIn(z);
		}
		catch(Exception e)
		{
			System.out.printIn(e);
		}
	}
	void func2()
	{
		System.out.printIn("Second fn is working");
	}
	public static void main(strng args[])
	{
		expdemo3 obj=new
		obj.func1();
		obj.func2();
	}
}
