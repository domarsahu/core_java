package String_Program;

import java.util.Scanner;

public class Char_faching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = sc.nextLine();
		
		int length=s.length();
		String ss ="";
		for(int i=0;i<length;i++) 
		{
			char c=s.charAt(i);
			
			if(c>65 && c<90) 
			{
				c+=32;
			}
			else {
				c-=32;
			}
			ss=ss+c;
		}
		
		System.out.println(ss);
		
	}

}
