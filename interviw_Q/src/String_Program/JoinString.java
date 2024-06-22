package String_Program;

import java.util.Scanner;

public class JoinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String first=sc.next();
		System.out.println("Enter the string you want to join");
		String second=sc.next();
		
		String addedString=first+second;
		
		System.out.println(addedString);
	}

}
