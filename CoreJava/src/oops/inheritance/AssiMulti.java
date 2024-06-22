package oops.inheritance;


class A{
	int n = 20;
	public void m1()
	{
		System.out.println(n);
	}
}

class B extends A{
	
	public void m2 () {
		System.out.println("class B");
		
		A o1 = new A();
		o1.m1();
	}
}


public class AssiMulti extends B{
	
	public static void main(String[] args) {
		System.out.println("i am main");
		
		B o2 = new B();
		o2.m2();
	}
	

}
