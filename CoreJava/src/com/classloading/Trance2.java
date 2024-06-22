package com.classloading;

public class Trance2 {
	static int x;
	static int y =10;
	static int z = add();
	public void n2() {
		System.out.println("n2");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		m1();
		System.out.println("bye");
		m1();
		System.out.println(z);
		int a = add();
		System.out.println(a);
	}
	
	public static void m1() {
		System.out.println("from m1");
		System.out.println(x+y);
	}
	
	public static int add()
	{
		System.err.println("addtion");
		return 7;
	}
}
