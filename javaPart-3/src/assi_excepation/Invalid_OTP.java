package assi_excepation;

import java.util.Scanner;

class OTP{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5434 OTP ");
		System.out.print("Enter OTP : ");
		int enterotp = sc.nextInt();
		if (5434 == enterotp)
		{
			System.out.println("Done");
		}
		else 
		{
			try
			{
				throw new Invalid_OTP();
			}
			catch(Invalid_OTP e)
			{
				System.out.println(e.get());
				
			}
		}
		
	}
}


public class Invalid_OTP extends Exception {

	public String get()
	{
		return "Invalid OTP";
	}
}
