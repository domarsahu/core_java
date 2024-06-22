class Employee
{
	private String name ;
	private int id ;
	private long phno;
	private int pw;

	Employee(String name , int id , long phno, int pw)
	{
		this.name = name ;
		this.id = id;
		this.phno = phno;
		this.pw = pw;
	}

	public void getName(int pw)
	{
		if(this.pw == pw)
		{
			System.out.println(name);
		}
		else
		{	
			System.out.println("invalid password");
		}
	}
	public void setName(String name , int pw)
	{
		if(this.pw== pw)
		{
			this.name = name ;
		}
		else 
		{
			System.out.println("invalid password");
		}
	}

	public void getId(int pw)
	{
		if (this.pw == pw)
		{
			System.out.println(id);
		}
		else
		{
			System.out.println("Invalid password");
		}
	}

	public void getPhone(int pw)
	{
		if(this.pw == pw )
		{
			System.out.println(phno);
		}
		else
		{
			System.out.println("ivalid password");
		}
	}
	public void setPhone(int pw, long phno)
	{
		if(this.pw == pw)
		{
			this.phno = phno;
		}
		else
		{
			System.out.println("invalid password");
		}
	}
	public void setPw(int pw , int old_pw)
	{
		if(this.pw == old_pw)
		{
			this.pw = pw;
		}
		else
		{
			System.out.println("invalid password");
		}
	}

	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Domar" , 101, 9090909090l, 123);
		//e1.getName(123);

		e1.setName("ghanshyam" , 123);

		System.out.println(e1.name);o
		System.out.println(e1.pw);
		
	}
	
}