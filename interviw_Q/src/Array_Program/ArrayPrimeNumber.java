package Array_Program;

import java.util.Scanner;

public class ArrayPrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a lenght of array");
		int len = sc.nextInt();
		int i,j =0;
		int count ;
		System.out.println("enter a number ");
		int a [] = new int [len];
		
		for( i =0 ; i<len ; i++) 
		{
			a [i] = sc.nextInt();
	
		}
		
		System.out.println("prime Number is : ");
		for (i =0 ;i<len;i++)
		{
			count =0;
			for(j=1 ; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
		
			if(count == 2)
			{
				System.out.println(a[i]+" ");
			}
		
		}

	}
}
