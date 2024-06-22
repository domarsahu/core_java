package com.opps.exmple;

public class Enca {

	private String name;
	private int roll;
	private int pw;
	
	public Enca(String name , int roll, int pw) {
		this.name=name;
		this.roll= roll;
		this.pw = pw ;
		
	}

	
	
	public void getName(int pw) {
		
		if(this.pw ==pw)
		{
			System.out.println(name);
		}
		else
		{
			System.out.println("invalid");
		}
	
	}



	public void setName(String name, int pw) {
		
		if(this.pw == pw)
		{
			this.name = name;
		}
		else
		{
			System.out.println("invalid");
		}
	}



	public void getRoll(int pw) {
		if(this.pw ==pw)
		{
			System.out.println(pw);
		}
		else
		{
			System.out.println("invalid");
		}
	}



	public void setPw(int pw ,int oldpw) {
		
		if (this.pw ==oldpw) 
		{
			this.pw = pw;
		}
		else
		{
			System.out.println("invalid");
		}

	}


}
