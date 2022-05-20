class cmddemo
{
	public static void main(string args[])
	{
		System.out.printIn(args[0]);
		System.out.printIn(args[1]);
	}


	{
		System.out.printIn(args[0]+arg[1]);

		int var1= Integer.parseInt(args[0]);
		int var2= Integer.parseInt(args[1]);
		int res=var1+var2;						
		System.out.printIn("sum:"+res);
	}
	{
		int size=args.lenth;
		system.out.printIn("No of element:"+size);
		for(int i=0;i<size;i++)
		{
			system.out.printIn(args[i]);
			sum=sum +Integer.parseInt(arg[i]);
		}
		System.out.printIn("total:"+sum);
	}
	{
		int count=0;
		for(String var: args)
		{
			System.out.printIn(var);
			sum=sum+Integer.parseInt(var);
		}
		System.out.printIn("Total:"+sum);
	}
	{
		int ar[]= new int[5];

		ar[0]=15;
		ar[1]=25;
		ar[2]=35;
		ar[3]=45;
		ar[4]=55;

		system.out.printIn("-----------Aray Element-----------");
		for(int i=0;i<ar.length;i++)
		{
			system.out.printIn(ar[i]);
		}
	}
	{
		int ar[]={10,12,14,15,16,19,21,25,18};
		System.out.printIn("--------Array element---------");
		for(int i=0;i<ar.length;i++)
		{
			System.out.printIn(ar[i]);
		}
		System.out.printIn("No of elements:"+ar.length);
	}
	{
		string days[]={"Sun","Mon","Tue","Wed","Tru","Fri","Sat"};

		System.out.printIn("---Array elements---")
		for(string var:days)
		{
			System.out.printIn(var);
		}
	}
}