package oops.polymorphism;

// Method Shodwing


class Parent {
	public static void m1()
	{
		System.out.println("parent");
	}
}

public class Method_Shodwing extends Parent {
	public static void m1()
	{
		System.out.println("child");
	}
	
	public static void m2()
	{
		
	}
	
	public static void main(String[] args) {
		Parent o1 = new Parent(); 
		o1.m1();
		m1();
	}

}
