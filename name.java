class NameException extends Exception
{
	NameException()
	{
		System.out.println("blank name")
	}
}
class name
{
	void func()
	{
		try
		{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter ur name");
			String Name= sc.next();

			if()
			{
				System.out.println(name);
			}
			else
			{
				throw new NameException();
			}
		}
		catch(NameException z)
		{
			System.out.println(z);
		}
		finally
		{
			System.out.println("Thannnnnnnnnnnnnnnnnnk youuuuuuuuuuuuuuuuu");
		}
	}
	public Static void main(String args[])
	{
		userexp2 obj=new userexp2();
		obj.func();
	}
}