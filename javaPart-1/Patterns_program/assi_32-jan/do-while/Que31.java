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
		do
		{
			char j ='A' ; 
			do
			{
				System.out.print(a);
				a++;
				j++;
			}while(j <=i );
		System.out.println();
		i++;
		}while( i<='C');

	}

}