package String_Program;

import java.util.Scanner;

public class CheckEqualString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String first=sc.next();
		System.out.println("Enter second string yu want to check");
		
		String second=sc.next();
		
		if(first.equals(second)) {
			System.out.println("string first: "+first+"  and second: "+second+"  are equal");
		}else {
			System.out.println("string first: "+first+"   and second: "+second+" are not equal");

		}
	}

}
