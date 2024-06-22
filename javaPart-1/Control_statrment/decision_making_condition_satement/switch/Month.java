/*  wajp to assume month number of the user and print how many are there in the month.
*/

class Month
{
	public static void main(String[] args)
	{
		int a = 9;
		switch(a)
		{
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10:
			case 12:
			{
				System.out.println("31 days");
				break;
			}

			case 2:
				System.out.println("28 or 29 days");
				break;

			case 4,6,9,11:
			{
				System.out.println("30 days"); 
				break;
			}
			default:
				System.out.println("Invaild");
				break;
		}
	}

}