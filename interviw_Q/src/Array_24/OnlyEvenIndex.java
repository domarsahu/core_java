package Array_24;

import java.util.Scanner;

// print only even index array elements in a array and product of even;

public class OnlyEvenIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int len = sc.nextInt();
		
		System.out.println("enter the array ");
		int a [] = new int [len];
		
		for(int i =0; i<len ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0 ; i<len ; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		int pro = 1;
		for(int i = 0 ; i<len ; i++) {
//			System.out.print(a[i]+ " ");
			if(i%2 == 0) {
				System.out.println("only even index : "+a[i]);
				
				
				// product of even number 
				
				pro = pro * a[i];
				
			}
		}
		System.out.println("product : "+pro);
		
		
	}

}
