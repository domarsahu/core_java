package Exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	
		try
		{
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("b is Zero");
		}
		finally
		{
			System.out.println("hii");
		}
	}
	

}
