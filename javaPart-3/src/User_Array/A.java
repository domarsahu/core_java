package User_Array;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row ");
		int row = sc.nextInt();
		System.out.println("enter colunm");
		int col = sc.nextInt();
		
		int n [] [] = new int [row][col];
		
		for(int i=0 ; i<row ; i++ )
		{
			for(int j =0; j<col ; j++)
			{
				n[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("printing ");
		
		for(int i = 0 ; i<row ; i++)
		{
			for(int j = 0 ; j<col ; j++)
			{
				System.out.println(n[i][j] + " ");
			}
		}
		
	}

}
