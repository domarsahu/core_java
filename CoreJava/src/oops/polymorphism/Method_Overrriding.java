package oops.polymorphism;

// method Overrinding


class Parentss{
	public void m1()
	{
		System.out.println("i am parent M1");
	}
	public void m2(int a )
	{
		System.out.println("parent " + a);
	}
}

public class Method_Overrriding extends Parentss{

	public void m1()
	{
		super.m1();
		System.out.println("i am child m1");
	}
	public void m2(int a)
	{
		super.m2(5);
		System.out.println("child " +a);
	}
	
	public static void main(String[] args) {
		Method_Overrriding o1 = new Method_Overrriding();
		
		o1.m1();
		o1.m2(30);
		
	}
}
