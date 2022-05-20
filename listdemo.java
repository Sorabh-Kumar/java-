import java.util.*;

class listdemo
{
	void func(){
		List lst=new ArrayList();
		lst.add("coke");
		lst.add("DairyMilk");
		lst.add(500);
		lst.add(7.9);
		lst.add("DairyMilk");

		System.out.println(lst);
		System.out.println("No of item's:"+lst.size());
		
		System.out.println("\n\n-----------------------\n\n");
		//System.out.println(lst.get(1));//find
		//lst.set(1, "Kitkat");//replace
		//lst.remove(1)		//delete particular
		lst.clear();		//delete all
		System.out.println(lst);
		System.out.println("No of item's:"+lst.size());
	}
	public static void main(String args[]){
		listdemo obj = new listdemo();
		obj.func();
	}
}