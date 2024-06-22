package com.objectloading;

public class Demo3 {
	int a =10;
	int b;
	
	
	
	{
		System.out.println(" am non-static initializer");
	}
	public Demo3()
	{
		System.out.println("i am contructor");
		System.out.println(b);
		b=20;
	}
	
	public void add()
	{
		System.out.println("i am ADD method ");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		System.out.println(d);
		System.out.println(d.a);
		System.out.println(d.b);
	
		
		Demo3 d1 = new Demo3();
		Demo3 d2 = new Demo3();
		d2.a = 90;
		d1.a = 78;
		
		d2.add();
		d1.add();
		d.add();
	}
}
