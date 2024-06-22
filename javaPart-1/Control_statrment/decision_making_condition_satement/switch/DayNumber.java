/* wajp to assume day number of the user and print the equivalent day nume.
*/

class DayNumber
{
	public static void main(String [] args)
	{
		
		int a = 3;
		System.out.println("giver Day Number : "+a);
		switch(a)
		{
			case 1:
			{
				System.out.println("sunday");
				break;
			}
			case 2:
			{
				System.out.println("monday");
				break;
			}
			case 3:
			{
				System.out.println("tuesday");
				break;
			}
			case 4:
			{
				System.out.println("wednesday");
				break;
			}
			case 5:
			{
				System.out.println("thusaday");
				break;
			}
			case 6:
			{
				System.out.println("friday");
				break;
			}
			case 7:
			{
				System.out.println("saturday");
				break;
			}
			default:
			{
				System.out.println("invailid");
				break;
			}
		}
	}
}