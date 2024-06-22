/* wajp to read month number from the user and print how manydays are there   int the month   */

class CountMonth
{
	public static void main(String[] args)
	{
		int m = 1;
		if(m==1 || m==3 || m==5 || m==7 || m==8 ||  m==10 || m==12)
		{
			System.out.println("Given Months is : 31 days");
		}
		else if(m==2)
		{
			System.out.println("Given Month is : 28 or 29 day");
		}
		else if(m==4 || m== 6 ||m==9 || m== 11)
		{
			System.out.println("Given Months is : 30 days");
		}
		else {
			System.out.println("Invalid");
		}
	}
		
}