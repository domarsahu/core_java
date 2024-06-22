package com.classloading;

public class SI2 {
	//static int a = demo()+test();;
	static String var1;
	
	static 
	{
		System.out.println("SHLI1");
		//demo();
	}
	public static void main(String[] args)
	{
		System.out.println("Strat of main ");
		//va1 = "Ram";
	}
}