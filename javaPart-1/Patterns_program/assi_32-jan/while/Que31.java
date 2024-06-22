/*	A
	BC
	DEF
*/

class Que31
{
	public static void main(String[] args)
	{
		char a ='A';
		char i = 'A';
		while( i<='C')
		{
			char j ='A' ; 
			while(j <=i )
			{
				System.out.print(a);
				a++;
				j++;
			}
		System.out.println();
		i++;
		}

	}

}