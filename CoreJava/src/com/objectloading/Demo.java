package com.objectloading;

public class Demo {
	int a ;
	int b;
	public Demo()
	{
		System.out.println("i am contructor");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
		System.out.println(d.a);
		
	}

}
