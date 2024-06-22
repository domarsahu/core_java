// WAJP to cheak character is Lowercase alphabet or not . 

class CharLowercase
{
	public static void main(String[] args)
	{
		char var = 'f';
		int ch = var;
		String res = ch >=97 && ch<=122 ?"lowercase":"Not lowercase";
		System.out.println(res);
	}
}