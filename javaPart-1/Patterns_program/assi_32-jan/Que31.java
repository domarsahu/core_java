/*	A
	BC
	DEF
*/

class Que31
{
	public static void main(String[] args)
	{
		char a ='A';
		
		for(char i = 'A'; i<='C'; i++)
		{
			for(char j ='A' ; j <=i; j++)
			{
				System.out.print(a);
				a++;
			}
		System.out.println();
		}

	}

}