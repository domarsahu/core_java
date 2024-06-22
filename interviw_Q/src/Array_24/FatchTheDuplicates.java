package Array_24;

import java.util.Scanner;

// Fetch duplicates elements from an array;

public class FatchTheDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int len = sc.nextInt();
		System.out.println("enter the array");
		
		int a[] = new int[len];
		
		for(int i =0 ;i<len ; i++) {
			a[i]= sc.nextInt();
		}
		
		for(int i =0 ; i<len; i++) {
			System.out.print(a[i]+" ");	
		}
		System.out.println();
		for(int i = 0; i<len ;i++) {
			for (int j=i+1 ; j<len; j++) {
				
				if(a[i]==a[j]) {
					System.out.println("dublicate value is : "+a[j]);
				}
			}
		}
		
	}

}
