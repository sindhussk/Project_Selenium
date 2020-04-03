package org.demo.Multiplenheritance;

public class InterfaceClass implements Interface1,Interface2 {

	int a=10,b=2,c;
	@Override
	public void mul() {
		c=a*b;
		System.out.println("mul is" +c);
		
	}

	@Override
	public void div() {
		c=a/b;
		System.out.println("div is "+c);
		
	}

	@Override
	public void add() {
		c=a+b;
		System.out.println("add is " +c);
		
	}

	@Override
	public void sub() {
		c=a-b;
		System.out.println("sub is "+c);
		
	}
	public static void main(String[] args) {
		InterfaceClass i=new InterfaceClass();
		i.add();
		i.sub();
		i.mul();
		i.div();
	}

}
