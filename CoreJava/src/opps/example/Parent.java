package opps.example;

class Parent{
	
	private String name ;
	private int  pw ;
	
	Parent(String name, int pw){
		this.name = name ;
		this.pw = pw;
	}
	
	public void getName(int pw)
	{
		if (this.pw == pw)
		{
			System.out.println(name);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
	public void setName(String name , int pw)
	{
		if(this.pw == pw)
		{
			this.name = name;
		}
	}
	
	public void getPw(int pw , int oldPw)
	{
		if(this.pw==oldPw)
		{
			this.pw = oldPw;
		}
		else
		{
			System.out.println("invalid");
		}
	}


}


