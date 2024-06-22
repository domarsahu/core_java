package oops.abstracation;

 abstract class A{
	
	public static void m1()
	{
		System.out.println("hii ");
	}
	
	
	abstract public void m2();
	
}

class B extends A{
	
	public void m2()
	{
		System.out.println("hello");
	}

	 public static void main(String[] args) {
		
		 B o1 = new B();
		 o1.m2();
		
	}
}
