//WAJP to cheak weather than given character is vowal or consonent take a user input 

import java.util.Scanner;
class VowalConso 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a any character ");
		char ch = ss.next().charAt(0);

		if (ch == 'A' || ch == 'a' || ch == 'E'||ch == 'e' || ch == 'I'|| ch == 'i'|| ch == 'O'|| 
			   ch == 'o'|| ch == 'U'|| ch == 'u')
		{
			System.out.println(ch + " : is vowal ");
		}
		else
		{
			System.out.println(ch + " : is Consonent");


		}
	}
}
