package oops.inheritance;

class Papa {
	static int z = 10;
	
	public static void m1() {
		int a = 10;
		System.out.println(a);
	}

}

public class Beta extends Papa {
	public static void main(String[] args) {
//		Papa o = new Papa();
		System.out.println(Papa.z);
		
		Papa.m1();

	}

}