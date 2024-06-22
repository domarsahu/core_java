package oops.encapusulation;

// encapulations Bank Account



public class Bank {
	
	private long account_no;
	private String acc_holder_name ;
	private float balance;
	private String pwd;
	
	
	Bank(long account_no,String acc_holder_name,float balance, String pwd )
	{
		this.account_no = account_no;
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
		this.pwd = pwd;
		
	}
	
	public void getAccno(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println("account number :  " +account_no);
		}
		else
		{
			System.out.println("invalid pwd");
		}
	}

	public void getAccHolderName(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println("account name : " +acc_holder_name);
		}
		else
		{
			System.out.println("invalid pwd");
		}
	}
	
	public void setAccHolderName(String acc_holder_name, String pwd)
	{
		if(this.pwd == pwd)
		{
			this.acc_holder_name = acc_holder_name;
			System.out.println("account name : " +acc_holder_name);
		}
		else
		{
			System.out.println("invalid pwd");
		}
	}
	
	public void getBalance(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println("Balance : "+balance);
		}
		else
		{
			System.out.println("invalid pwd");
		}
	}
	
	
	public void setBalance(float balance, String pwd)
	{
		if(this.pwd == pwd)
		{
			this.balance = this.balance + balance;
					//this.balance +balance;
		}
		else
		{
			System.out.println("invalid pwd");
		}
	}
	
	public void setPassword(String pwd, String old_pwd)
	{
		if(this.pwd == old_pwd)
		{
			this.pwd =pwd;
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
