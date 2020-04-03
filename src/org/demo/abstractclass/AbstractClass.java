package org.demo.abstractclass;

public abstract class AbstractClass {
	public int a=10;
	public int b=3;
	public int c;
	public abstract void sub();
	public abstract void add();
	public void mul()
	{
		c=a*b;
		System.out.println("mul is: " +c);
	}
	
	
	

}
