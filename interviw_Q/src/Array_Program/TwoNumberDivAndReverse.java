package Array_Program;

import java.util.Scanner;

/* given number the nuber is haf then reverse number of haf number .
 EX.     2,3,4,5,6,7,8,9   reverse = 9,8,7,6
		output:-   2,3,4,5,9,8,7,6
*/
public class TwoNumberDivAndReverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght : ");
		int len= sc.nextInt();
		System.out.println("Enter the number");
		int a[] = new int[len];
		
		for(int i = 0; i<len;i++) {
			a[i] = sc.nextInt();
		}
		
		int haf =len/2;
		
		System.out.println(haf);
		for(int i=0 ;i<haf;i++) {
			System.out.print(a[i]+ " ");
		}
		
		for(int j=len-1 ; j>=haf ; j--) {
			System.out.print(a[j]+" ");
		}
		
	/*	int a [] = {2,3,4,5,6,7,8,9};
		
		int len = a.length/2;
			for(int i =0 ; i<len ; i++) {
				System.out.print(a[i]+" ");
			}
	
			for(int j =a.length-1; j>=len; j--) {
				
				
				System.out.print(a[j]+" ");
			
			}
			*/
	
		
		
	}

}
