// WAJP to store char type data('A') inside the short and int type variable and print it.

class StorChar
{
	public static void main(String[] args)
	{
		char c = 'A';
		short s = (short)c;
		int a =  c;

		System.out.println(c);
		System.out.println(s);
		System.out.println(a);

	}
}