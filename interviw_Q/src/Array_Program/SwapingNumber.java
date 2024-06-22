package Array_Program;

import java.util.Scanner;

// Swaping the two number without thrid varable ;

public class SwapingNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("enter the second number : ");
		int num2 = sc.nextInt();
		
		num1 = num1 + num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("first number : "+num1);
		System.out.println("second number : "+num2);
		
		
	}

}
