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
		while( i<=3)
		{
			int j =1 ;
			while( j <=i )
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