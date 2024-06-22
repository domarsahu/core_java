// WAJP to cheak Leap Year or Not.

class LeapYear
{
	public static void main(String[] args)
	{
		int n = 2024;
	
		if ((n%4 == 0  && n%100 != 0 ) || (n%400 == 0 ))
        	{
			System.out.println(n+ " is leap year");
		}
		else  {
			System.out.println(n+ " is Not leap Year");
		}
		
	}

}