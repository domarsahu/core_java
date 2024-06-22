package Array_24;

import java.util.Scanner;

// print only the prime array elements

public class PrimeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("length of array");
		int len = sc.nextInt();
		
		System.out.println("enter the array");
		int a [] = new int[len];
		for (int i=0 ; i<len ;i++) {
			a[i]= sc.nextInt();
		}
		
		for(int i=0 ;i<len ; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("prime number : ");
		for(int  i=0 ; i<len ; i++) {
			int count = 0;
			
			for(int j=1; j<=a[i] ;j++) {
				
				if(a[i]%j ==0) {
					count ++;
				}
				
			}
			
			if(count ==2) {
				System.out.println("prime number : "+a[i]);
			}
			
		}
		
	}

}