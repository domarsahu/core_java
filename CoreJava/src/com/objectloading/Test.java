package com.objectloading;

public class Test {
	
	
	{
		System.out.println("from milns");
	}
	
	static int a = 40;
	{
		System.out.println("value of a is " + a);
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("the value of a is is " + a);
	}
}



