package interfacess;

interface A{
	void m1();
	
}

class B implements  A{
	public void m1()
	{
		System.out.println("hell");
	}
	
}


public class Inter_Main {
	
	public static void main(String[] args) {
		A o1 = new B();
		o1.m1();
		
	}

}
