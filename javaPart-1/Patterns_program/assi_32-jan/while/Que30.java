/*	A
	AB
	ABC
*/

class Que30
{
	public static void main(String[] args)
	{
		char i = 'A';
		while( i<='C')
		{
			char j ='A' ;
			while( j <=i )
			{
				System.out.print(j);
				j++;
				
			}
		System.out.println();
		i++;
		}

	}

}