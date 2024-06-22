/*	A
	AB
	ABC
*/

class Que30
{
	public static void main(String[] args)
	{
		char i = 'A';
		do
		{
			char j ='A' ;
			do
			{
				System.out.print(j);
				j++;
				
			}while( j <=i );
		System.out.println();
		i++;
		}while( i<='C');

	}

}