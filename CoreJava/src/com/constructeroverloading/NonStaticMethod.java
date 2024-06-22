package com.constructeroverloading;

public class NonStaticMethod {
	
	public void m1(int r , String s)
	{
		System.out.println(r);
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		NonStaticMethod o1 = new  NonStaticMethod();
		o1.m1(5, "ankit");
	}
}
