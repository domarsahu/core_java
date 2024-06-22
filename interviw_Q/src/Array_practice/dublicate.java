package Array_practice;

import java.util.Scanner;

// find the dublicate values 

public class dublicate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int len = sc.nextInt();
		System.out.println("Enter the number ");
		int a[] = new int [len];
		
		for(int i=0 ; i<len ; i++) {
			a[i] =sc.nextInt();
		}
		
		System.out.println("given array is ");
		for(int i =0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Dublicate values is : ");
		for(int i =1 ; i<len ;i++) {
			for(int j = i+1; j<len; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+", ");
				}
			}
		}
	}
	

}
