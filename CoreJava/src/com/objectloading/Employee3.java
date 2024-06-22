package com.objectloading;

public class Employee3 {
	static String c_name = "TYSS";
	String ename ;
	int eid ;
	double salary;
	int dno = 40;
	{
		System.out.println("welcome to "+c_name );
		System.out.println("||| job vacancy is there |||");
		System.out.println("||| refer your friend for place |||");
	}
	
	public void printDetails()
	{
		//String ename = "dev";
		// Employee3 e = new Employee3();
		System.out.println(this.ename);
		System.out.println(eid);
		System.out.println(salary);
	}
	{
		System.out.println("welcome to dept no "+dno);
		System.out.println(ename );
		System.out.println(eid);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee3 e1 = new Employee3();
		Employee3 e2 = new Employee3();
		String ename = "Rajib";
		System.out.println(ename);
		System.out.println(e2.eid);
		System.out.println(e1.salary);
		e1.salary = 78;
		e2.salary = 67;
		
		e1.printDetails();
		e2.printDetails();
	}

}
