package oops.inheritance;

class M1{
	
		int a = 10;
		int b = 23;
	
	
	
}

class M2 extends M1{
	
	M1 o1 = new M1();
	
	int add = o1.a + o1.b;
	
	
	
}


class M3 extends M2{
	
	M2 o2 = new M2();
	
	int num = 29;
	
	int res = add - num ;
	
	
}


public class MultiA {
	
	public static void main(String[] args) {
		
		M3 o3 = new M3();
		
		System.out.println(o3.res);
		
		
	}

}
