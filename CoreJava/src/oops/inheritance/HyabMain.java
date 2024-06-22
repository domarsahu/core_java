package oops.inheritance;

class HybriA{
	int n = 10 ;
	public void m1() {
		System.out.println(n);
	}
	
	
}

class HybriB extends HybriA{
	
	public void m2() {
		System.out.println("class B");
		HybriA o1 = new HybriA();
		o1.m1();
	}
	
}

class HybriC extends HybriA{
	
	public void m3 () {
		System.out.println("class C ");
		HybriA o4 = new HybriA();
		o4.m1();
	}
	
}


public class HyabMain  extends HybriB{
	public static void main(String[] args) {
		System.out.println("i am main");
		HybriB o2 = new HybriB();
		o2.m2();
	}

}
