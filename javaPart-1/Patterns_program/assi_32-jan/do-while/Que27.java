/*	1
	12
	123
*/

class Que27
{
	public static void main(String[] args)
	{
		int a = 1;
		int i = 1;
		do
		{
			int j =1 ;
			do
			{
				System.out.print(a);
				a++;
				j++;
			}while( j <=i );
		System.out.println();
		i++;
		}while( i<=3);

	}

}