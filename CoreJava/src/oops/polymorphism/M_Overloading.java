package oops.polymorphism;

// Method Overloading 


public class M_Overloading {
	
	public static void m1()
	{
		System.out.println("call m1");
	}
	private static void m1(int a)
	{
		System.out.println(a);
	}
	
	protected void m1(String name , int roll)
	{
		System.out.println(name );
		System.out.println(roll);
	}
	
	void m1(int n , int m)
	{
		System.out.println(n);
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		M_Overloading o1 = new M_Overloading();
		
		m1();
		m1(202);
		o1.m1("domar" , 10102);
		o1.m1(60, 20);
		
		
	}

}
