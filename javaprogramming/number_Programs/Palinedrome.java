// WAJP to print the palinedrome numbers from  11 to 111.

import java.util.Scanner;
class Palinedrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
        int rev = 0;
		int temp = num;
      
	   
		if (num>=11 && num<=111)
		{
			int rem = num%10;
			rev = rev*10 +rem;
			num= num/10;
		
			//num = temp;
			if(rev == num)
			{
				System.out.println("Given number is palinedrome");
			}
			else {
				System.out.println("Given number is Not  palinedrome");

			}
		}
		else {
			System.out.println("Enter the number is Invalid");
		}
	}
}


/* 
     for(int num = 11; num <=111; num++)
	 {
	   int temp = num;
	   int rev=0;
	   while (num !=0)
	   {
	   
	   }
	 
	 }