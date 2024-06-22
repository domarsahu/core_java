// Constructor Overloadind

class COverloading
{
	String name;
	int id;
	//String email;
	long pnumber;

	COverloading()
	{
		System.out.println("no argument constructor");
	}

	COverloading(String name )
	{
		this.name = name;
	}

	COverloading(int id)
	{
		this.id= id;
	}


	COverloading(long pnumber)
	{
		this.pnumber = pnumber;
	}

	public static void main(String[] args)
	{
		COverloading o1 = new COverloading("Domar");
		COverloading o2 = new COverloading(101);
		//COverloading o3 = new COverloading("domarsahu@gmail.com");
		COverloading o4 = new COverloading(2929292938l);

		System.out.println(o1.name);
		System.out.println(o2.id);
		//System.out.println(o3.email);
		System.out.println(o4.pnumber);

	}
}