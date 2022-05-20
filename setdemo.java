
import java.util.*;
class setdemo
{
	void func()
	{
		Set st= new HashSet();
		st.add("coke");
		st.add("perk");
		st.add(2000);
		st.add(6.5);

		System.out.println(st);
		System.out.println("no of item:"+st.size());

	}
	public static void main(String args[])
	{
		setdemo obj= new setdemo();
		obj.func();
	}
}