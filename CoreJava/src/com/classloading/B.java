package com.classloading;

public class B {
	static int i ;
	
	static 
	{
		i =9;
		System.out.println("hii");
	}
	public static void main(String[] args)
	{
		System.out.println("a");
		i = 9;
		
	}
	
}
