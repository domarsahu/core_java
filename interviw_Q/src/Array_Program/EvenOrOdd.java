package Array_Program;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of array");
		int len = sc.nextInt();
		
		System.out.println("enter a Number ");
		int a[] = new int [len];
		
		for (int i =0 ; i<len ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("result");
		for(int i =0; i<len ; i++)
		{
			
		//	if(a[i]%2 == 0 && a[i]>10 && a[i]<99)  // 2 digit even or odd
			if(a[i]%2 ==0) // event and odd
			{
				System.out.println("number is Even : "+a[i]);
			}
			else {
				System.out.println("number is odd : "+a[i]);
			}
		}
	}

}
