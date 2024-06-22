package Array_Program;

import java.util.Scanner;

// find the product of given number array;

public class ProductOfGivenNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("lenght of array");
		int len =sc.nextInt();
		System.out.println("enter the number ");
		int a[] = new int [len];
		
		for(int i = 0; i<len ; i++) {
			a[i]=sc.nextInt();
		}
		int pro = 1;
		
		for(int i = 0; i<len ; i++) {
			pro = pro * a[i];
		}
		System.out.println("product of array : "+pro);
	}

}
