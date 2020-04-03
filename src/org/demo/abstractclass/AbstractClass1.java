package org.demo.abstractclass;

public class AbstractClass1 extends AbstractClass {

	@Override
	public void sub() {
		c=a-b;
		System.out.println("sub is :" +c);
		
	}

	@Override
	public void add() {
		c=a+b;
		System.out.println("add is : " +c);
		
	}
	public static void main(String[] args) {
		AbstractClass1 a=new AbstractClass1();
		a.add();
		a.sub();
		a.mul();
	}

}
