import java.util.Scanner;

class expdemo4
{
	void func1()
	{
		try
		{
			int ar[]=new int[5];
`			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array elements:");
			for(int i=0;i<5;i++)
			{
				System.out.printIn(ar[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array problem occur........"+ae);
		}
		catch(ArithmeticException e)
		{
			System.out.println("division problem occur.....");
		}
	}
	void func2()
	{
		System.out.println("second fn is working");
		}
	public static void main(String args[])
	{
		expdemo4 obj=new
		obj.func1();
		obj.func2();
	}
}
