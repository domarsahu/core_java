/*      1 1 1 
	1 1 1
	1 1 1
*/
class Patten13x3
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{	
			int j = 1;
			do
			{
				System.out.print(1);
				j++;
			}
			while(j<=3);
		System.out.println();
		i++;
		}
		while(i<=3);	
	}
}