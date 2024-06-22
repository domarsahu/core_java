package com.constructeroverloading;

public class DemoChaning {
	
	int a;
	int b;
	int c;
	int d;
	int e;
	
	DemoChaning(int a)
	{
		this.a=a;
		System.out.println("c1");
	}
	DemoChaning(int a , int b)
	{
		this(5);
		this.b=b;
		System.out.println("c2");
	}
	DemoChaning(int a , int b, int c)
	{
		this(6,7);
		this.c=c;
		System.out.println("c2");
	}
	DemoChaning(int a , int b, int c ,int d)
	{
		this(6,7,8);
		this.d=d;
		System.out.println("c2");
	}
	DemoChaning(int a , int b , int c, int d,int e)
	{
		this(5, 5,7,9);
		this.e=e;
		System.out.println("c2");
	}
	

	
	public static void main(String[] args) {
		DemoChaning d1 = new DemoChaning(6,8,9,4,9);
		
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
		System.out.println(d1.e);
	}

}
