package com.constructeroverloading;

public class StudentChaning {
	
	String name ;
	int roll;
	StudentChaning()
	{
		System.out.println("Accaount is created");
	}
	StudentChaning(String name)
	{
		this();
		this.name =name ;
		System.out.println(name);
	}
	StudentChaning(String name , int roll)
	{
		this(name);
		this.roll = roll;
		System.out.println(name + " " + roll);
	}
	
	public static void main(String[] args) {
		StudentChaning s = new StudentChaning("Domar" , 5);
	}

}
