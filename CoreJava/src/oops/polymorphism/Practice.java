package oops.polymorphism;




class Paren {
	
	 int a=5;
	 static int b=10;
	 
}


public class Practice extends Paren{

	int b=10;
	static int a=20;
	
	void m1() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		new Practice().m1();
		
		
	}
}
