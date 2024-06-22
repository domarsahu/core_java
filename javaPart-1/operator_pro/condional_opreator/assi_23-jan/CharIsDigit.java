	// WAJP to cheak character is Uppercase alphabet or not . 

class CharIsDigit
{
	public static void main(String[] args)
	{
		char ch = '4';
	//      int ch = var;                                             
		String res = ch >=48 && ch<=57 ?"digit":"Not digit";
		System.out.println(res);
	}
}