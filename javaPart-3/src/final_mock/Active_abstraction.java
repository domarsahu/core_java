package final_mock;

//Active abstraction by the help interface

interface Idemo{
	
	void m1();
	
}

class Active_abstraction implements Idemo{
	
	public void m1() {
		System.out.println("i am main m1");
	}
	
	public static void main(String[] args) {
		
		Active_abstraction o = new Active_abstraction();
		o.m1();
		
	}

}
