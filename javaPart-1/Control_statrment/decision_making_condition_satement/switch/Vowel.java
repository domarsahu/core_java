class Vowel
{
	public static void main(String[] args)
	{
		char ch = 'a';
		switch(ch)
		{
			case 'a','e','i','o','u':
			{
				System.out.println("Vowel");
				break;
			}
			case 'b','c','d','f','g','h','j','k','l','z','x','v','n','m','q','w','r','t','y','p','s':
			{
				System.out.println("Consonets");
				break;
			} 
			default :
			{
				System.out.println("Invaild");
				break;
			}
			
		}

	}
}