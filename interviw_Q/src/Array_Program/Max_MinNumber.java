package Array_Program;

import java.util.Scanner;

public class Max_MinNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length ");
		int len = sc.nextInt();
		System.out.println("enter a number ");
		int a [] = new int[len];
		for(int i=0; i<len; i++)
		{
			a[i] = sc.nextInt();
		}
	// maxmum value *****************
		int max = a[0];
		for(int i =0 ; i<len; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		//deacending 
//		for(int i =0; i<len ; i++)
//		{
//			System.out.print(a[i]+ " ");
//		}
		System.out.print("maxmum value is : "+max);
		
		System.out.println();
	// minmum value **********************
		int min = a[0];
		for(int i= 0; i<len; i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
		}
		System.out.print("minmun value is : "+min);
		
	}

}
