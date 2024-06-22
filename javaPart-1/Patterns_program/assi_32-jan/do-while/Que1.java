class Que1
{
	public static void main(String[] args)
	{
		char i ='A';
		do
		{
			int j= 'A';
			do
			{
				System.out.print(i);
				j++;
			}while(j<='C');
		i++;
		System.out.println();
		}
		while(i<='C');
	}
}