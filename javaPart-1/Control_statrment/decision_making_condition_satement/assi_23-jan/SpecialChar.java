// WAJP to cheak to alphabet Special Charecter or not . 

class SpecialChar
{
	public static void main(String[] args)
	{
		char var = '*';
		int ch = var;
		
		if(ch >=32 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126 )
		{
			System.out.println("Special Charecter");
		}else{
			System.out.println("Not Special Charecter");
		}
	}
}