package com.constructeroverloading;

public class Student {
	
	String name;
	int roll;
	static String cname = "jsp";
	
	Student(String n )
	{
		name = n;
		System.out.println("Account is created and name is update");
	}
	Student(String n, int r)
	{
		name = n;
		roll = r;
		System.out.println("Account is created and name and roll is updated ");
	}
    
	Student(int r)
	{
		roll = r;
		System.out.println("Account is created and roll is updated");
	}
	Student()
	{
		System.out.println("Account is created and data is not updated");
	}
	
	public void printDetails()
	{
		System.out.println(name);
		System.out.println(roll); 
	}
	
	public static void main(String[] args) {
		Student s1 =new Student ();
		s1.printDetails();
		Student s2 =new Student (5);
		s1.printDetails();
		Student s3 =new Student ("dev", 5);
		s3.printDetails();
		Student s4 =new Student ("devi", 50);
		s4.printDetails();
		Student s5 =new Student ("devilal");
		s5.printDetails();
	}
	
	
}
