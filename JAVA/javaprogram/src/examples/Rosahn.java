package examples;

public class Rosahn {
	String name;
	int empid;
	Rosahn(String name,int empid){
		this.name = name;
		this.empid = empid;
		
		
	}
	public static void main(String[] args) {
		  Rosahn e1 = new Rosahn("domar", 102);
		  Rosahn e2 = new Rosahn("venky", 104);
		  System.out.println("Employee: "+ e1.name +" "+ e1.empid);
		  System.out.println("Employee: "+ e2.name +" "+ e2.empid);
	}
	

}
