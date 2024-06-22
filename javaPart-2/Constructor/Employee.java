/* Design an Employee class which consists of ename, eid as an attribute with the suitable constructor.  */

class Employee
{
	String ename;
	int eid;
	
	Employee(String ename)
	{
		this.ename = ename;
	}

	Employee(int eid)
	{
		this.eid = eid;
	}
	
	public static void main(String[] args)
	{
	 	Employee o1= new Employee("Domar");
		Employee o2= new Employee(101);
		
		System.out.println(o1.ename);
		System.out.println(o2.eid);
		
	}
}