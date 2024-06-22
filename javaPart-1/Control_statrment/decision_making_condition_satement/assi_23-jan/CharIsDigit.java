// WAJP to cheak character is digit or not . 

class CharIsDigit
{
	public static void main(String[] args)
	{
		char var = 'A';
		int ch = var;
		
		if(ch >=48 && ch<=57)
		{
			System.out.println("Digit");
		}else{
			System.out.println("not Digit");
		}
	}
}