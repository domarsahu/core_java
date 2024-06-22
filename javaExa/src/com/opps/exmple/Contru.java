package com.opps.exmple;

public class Contru {

	int a ;
	int b ;
	int c ;
	String name;
	long phono;
	
	
	public Contru(int b) {
	}


	public Contru(long phono,int a) {
		this.a = a;
	}


	public Contru(int c,String name) {
		this.c = c;
		
	}
	public Contru(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public static void main(String[] args) {
		
		Contru c = new Contru(7,6,9);
		Contru c1 = new Contru(4);
		Contru c2 = new Contru(030030303l, 34);
		Contru c3 = new Contru(4,"domar");
		
		System.out.println("a  " +c.a);
		System.out.println("b  " +c.b);
		System.out.println("c " +c.c);
		System.out.println("name  " +c.name);
		System.out.println("phono " +c.phono);
		
		
		
		
	}
	
}
