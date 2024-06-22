package oops.inheritance;

class HA {
	int a = 3;
	
}


class HarricleA extends HA{
	public static void main(String[] args) {
		HA o1= new HA();
		
		System.out.println(o1.a);
		
		HarricleB o2= new HarricleB();
		
		System.out.println(o2.b);
	
	}
	
	
}

class HarricleB extends HA{
	
	int b = 23;
}

