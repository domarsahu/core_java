package assi_excepation;

import java.util.Scanner;

class Balance {
	
	private double balance;
	private int pin ;
	
	Balance(double balance, int pin){
		this.balance = balance;
		this.pin = pin;
	}

	public void getBalance(int pin) 
	{
		if(this.pin == pin)
		{
			System.out.println(balance);
		}
		else
		{
			try
			{
				throw new Inscifficent_Balance();
			}
			catch(Inscifficent_Balance i)
			{
				System.out.println(i.getMassage());
			}
		}
	
	}

	public void setBalance(double balance)
	{
		
		if(this.pin == pin)
		{
				this.balance = balance;
		}
		else
		{
			try
			{
				throw new Inscifficent_Balance();
			}
			catch(Inscifficent_Balance i)
			{
				System.out.println(i.getMassage());
			}
			
		}
		
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pin : ");
		int pin = sc.nextInt();
		Balance b = new Balance(239239.203, 123);
		
		b.getBalance(pin);
		
	}
}




public class Inscifficent_Balance extends Exception
{
	
	public String getMassage()
	{
		return "Inscifficent Balance";
	}
	
}
