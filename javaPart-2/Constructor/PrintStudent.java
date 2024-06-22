/*Design the following requriment
             	sName;
		sId;
		cNo;

		printStudentDetails();
*/

class PrintStudent
{
	String sname;
	int sid;
	long cno;

	PrintStudent(String sname)
	{
		this.sname = sname;
	}
	
	PrintStudent(int sid)
	{
		this.sid = sid;
	}

	PrintStudent(long cno)
	{
		this.cno =cno;
	}

	public static void printStudentDetails()
	{
		PrintStudent o1= new PrintStudent("Domar");
		PrintStudent o2= new PrintStudent(102);
		PrintStudent o3= new PrintStudent(9293949596l);

		System.out.println(o1.sname);
		System.out.println(o2.sid);
		System.out.println(o3.cno);
	}

	public static void main(String[] args)
	{
		printStudentDetails();
	}
}
