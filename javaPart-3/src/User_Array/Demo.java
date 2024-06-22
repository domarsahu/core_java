package User_Array;
import java.util.Scanner;

public class Demo {
	
	private static int j;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a row : ");
		int row = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter a colunm : ");
		int col = sc.nextInt();
		
		System.out.println();
		
		int [][] arr =  new int [row] [col];
		
		for(int i= 0 ; i<row ; i++)
		{
			for(int j = 0 ; j<col; j++);
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("printing elment ");
		for(int i= 0 ; i<row ; i++)
		{
			for(int j = 0 ; j<col; j++);
			{
				System.out.println(arr[i] [j] +" ");
			}
		}
		
	}

}
