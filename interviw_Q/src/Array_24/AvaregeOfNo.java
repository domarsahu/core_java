package Array_24;

import java.util.Scanner;

//  Create a int type array and find the average of those element;

public class AvaregeOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("length of array : ");
		int len = sc.nextInt();
		
		System.out.println("enter the array ");
		int a [] = new int [len];
		int sum = 0;
		for(int i=0 ; i<len ; i++) {
			a[i] =sc.nextInt();
		}
		for(int i =0 ; i<len ; i++) {
			sum = sum +a[i];
		}
		
	   double res = sum/len;
		
		System.out.println("avarege of array : "+res);
		
	}

}
