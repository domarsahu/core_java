package com.nonpritypecasting;


class BB{
	int a = 10 ;
	
	
}
public class AA extends  BB{
	public static void main(String[] args) {
		AA o1 = new AA();
		BB o2 = o1;
		
		AA o3 = (AA)o2;
	}
	
	
	
}
