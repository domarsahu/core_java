package Array_Program;

import java.util.Scanner;

// Create a char array and print first and last char of that array;

public class CharArrayFristAndLast {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		char[] ch = new char[size];
		System.out.print("Enter Character: ");
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}

		System.out.println("first charcter : "+ch[0]);
		System.out.println("last character : "+ch[ch.length-1]);
		
	}

}
