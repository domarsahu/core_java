package Array_Program;

import java.util.Scanner;

// find the sum of given number array;

public class SumOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("lenght of array : ");
		int len =sc.nextInt();
		System.out.println("enter the number ");
		int [] a = new int [len];
		int sum = 0;
		
		for (int i =0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array : "+sum);
	}

}
