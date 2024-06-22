class NestedIfElse
{
	public static void main(String[] args)
	{
		int a = 213;
		int b = 34;
		int c = 473;
		
		if (a>b)
		{
			if(b>c)
			{
				System.out.println(b+ " is greaterthan");
			}else {
				System.out.println(c+ " is Greaterthan");
			}
		}
		else{
			System.out.println(a+ " is grater");
		}
		
	}

}