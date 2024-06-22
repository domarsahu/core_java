package Array_practice;

import java.util.Scanner;

// remove the dupalicte array from sorted Array 

public class Remove_Dublicate_SortedArray {

	public static void main(String[] args) {
		
		int a[] = {2,2,3,3,4,6,6,7};
		
		for(int i =0; i<a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		int j=0;
		for(int i= j+1; i<a.length; i++) {
			if(a[j] != a[i]) {
				j++;
				a[j]=a[i];
			}
		}
		
		j++;
		System.out.println();
		
		for(int i =0 ; i<j ; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}


//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter the length");
//int len = sc.nextInt();
//System.out.println("Enter the Number ");
//int a[] = new int [len];
//
//for(int i = 0 ; i<len;i++) {
//	a[i] = sc.nextInt();
//}
//
//System.out.println("dublicate values : ");
//int rd=0;
//for(int i=rd+1; i<len; i++) {
//	if(a[rd] !=a[i]) {
//		rd++;
//		a[rd] = a[i];
//	}
//}
//