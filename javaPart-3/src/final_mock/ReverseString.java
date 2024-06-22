package final_mock;

import java.util.Scanner;

// WAJP to read String from the user and reverse the String

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter A String");
		String s = sc.next();
		
		System.out.println("reverse String");
		
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
