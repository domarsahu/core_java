package Array_Program;

import java.util.Scanner;

// array and check all numbers are same or not in Java

public class CheckAllNoSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a length of array");
		int len = sc.nextInt();
		
		System.out.println("Enter a number");
		
		int a [] = new int [len];
		
		for (int i = 0 ; i<len;i++)
		{
			a[i] = sc.nextInt();
		}
		int c =0;
		for(int i = 0; i<len; i++)
		{
			if(a[i] ==a[0])
			{
				c++;
			}
		}
	    if(c==len) {
	    	
	    	System.out.println("all number is same");
	    }
	    else {
	    	System.out.println("not same ");
	    }
	}
}
