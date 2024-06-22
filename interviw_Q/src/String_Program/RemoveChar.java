package String_Program;

import java.util.Scanner;

// Remove character from input string in java

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		StringBuilder strb = new StringBuilder(str);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		System.out.print("update : ");
		for(int i =0 ;i<strb.length(); i++)
		{
			if(strb.charAt(i) == ch) {
				strb.deleteCharAt(i);
			}
			
		}
		System.out.print(strb);
		
	}

}
