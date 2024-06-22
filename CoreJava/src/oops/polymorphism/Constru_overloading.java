package oops.polymorphism;

// Constructor Overloading

public class Constru_overloading {
	
	Constru_overloading(){
		this(20130);
		System.out.println("constructer 1 ");
	}
	Constru_overloading(int roll)
	{
		this(01, "Domar");
		System.out.println("student roll " + roll);
	}
	Constru_overloading(int id , String name)
	{
		this(92832329232l);
		System.out.println("Student id " +id );
		System.out.println("Student name " +name );
	}
	
	Constru_overloading(long number )
	{
		this("Cg, Raipur");
		System.out.println("Student Number " +number);
	}
	
	Constru_overloading(String address)
	{
		System.out.println("Student address " +address);
	}
	
	public static void main(String[] args) {
		Constru_overloading o1 = new Constru_overloading();
		
//		Constru_overloading o2 = new Constru_overloading(10101);
//		Constru_overloading o3 = new Constru_overloading(101, "domar");
//		Constru_overloading o4 = new Constru_overloading(943293943093l);
//		Constru_overloading o5= new Constru_overloading("Raipur");
	}

}
