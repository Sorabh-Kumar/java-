import java.util.*;

class stackdemo
{
	void func()
	{
		Stack stk = new Stack();

		stk.push("Frooti");
		stk.push("Maggiee");
		stk.push(10);
		stk.push(5.6);
		stk.push("Coke");

		System.out.println("stk");
		System.out.println("Nossssss:"+stk.size());
		System.out.println("\n\n------------\n\n");
		System.out.println("delete:"+stk.pop());
		System.out.println("last element :"+stk.peek());

		System.out.print(stk);
		System.out.println("Nossssss:"+stk.size());
	}
	public static void main(String args[])
	{
		stackdemo obj = new stackdemo();
		obj.func();
	}
}