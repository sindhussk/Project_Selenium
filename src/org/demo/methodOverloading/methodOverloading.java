package org.demo.methodOverloading;

public class methodOverloading {
	public void details(int id)
	{
		System.out.println(id);
	}
	public void details(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void details()
	{
		System.out.println("method");
	}
	public static void main(String[] args) {
		methodOverloading m=new methodOverloading();
		m.details();
		m.details(101);
		m.details(102, "Sindhu");
	}

}
