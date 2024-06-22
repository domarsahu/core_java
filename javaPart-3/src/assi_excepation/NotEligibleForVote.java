package assi_excepation;

import java.util.Scanner;

public class NotEligibleForVote {
	
	public static void main(String[] args) 
	{
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		
		//System.out.println();
		
		if(age>=18)
		{
			System.out.println("Your Eligible for voting ");
		}
		else 
		{
			try
			{
				throw new NotEligibleExeption();
			}
			catch(NotEligibleExeption n)
			{
				System.out.println(n.getMassage());
			}
		}
	}
}
