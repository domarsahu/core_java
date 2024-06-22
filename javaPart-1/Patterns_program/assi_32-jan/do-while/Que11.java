/*	CC
	BB
	AA
*/

class Que11
{
	public static void main(String[] args)
	{
		char i = 'C';
		do
		{
			char j ='A' ;
			do
			{
				System.out.print(i);
				j++;
			}while( j <='B');
		System.out.println();
		i--;
		}while( i>='A' );

	}

}