// create a method which accepts no argument and return char.

class ReturnChar
{
	public static char m1(boolean b, float f, double d)
	{
		char ch = 'A';
		System.out.println("Return Char");
		return ch;
	}
	
	public static void main(String[] args)
	{
		m1(false, 38.44f, 54959.53);
	}

}