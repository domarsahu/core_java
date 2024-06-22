package String__2_pro;

import java.util.Scanner;

public class ReverseGivenString {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();
		
		String reverse = "";
		String word="";
		for(int i=0;i<s.length();i++) 
		{
			
			word=word+s.charAt(i);
			if(s.charAt(i)==' '|| i==s.length()-1) 
			{
				String rev="";
				for(int j = word.length()-1; j>=0; j--)
				{
					rev=rev+word.charAt(j);
				}
				if(i==s.length()-1)
				{
					rev=' '+rev;
					reverse=reverse+rev;
					word="";
				}
			}
			
		}
			
		System.out.println(reverse);
	}
}
