package oops.polymorphism;

// Variable Shodwing


class Parents {
	int x = 5;
	static int a = 20;
}

public class Var_Shodwing extends Parents {
	
	int x = 30;
	static int a = 40;
	
	public int m1() {
		
	//	System.out.println(super.x);
		return super.x;
	}
	
	public static void main(String[] args) {
		//Parents p = new Parents();
		Var_Shodwing c = new Var_Shodwing();
	//	System.out.println(.x);
		
		System.out.println(c.m1());
		System.out.println(Parents.a);
		System.out.println(c.x);
		System.out.println(a);
		
	}

}
