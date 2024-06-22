// WAJP to store int value into the byte,short, long ,float, double, char type variable .

class IntValue 
{
	public static void main (String[] args)
	{
		int a = 121;

		byte b =(byte) a;
		short s =(short) a;
		long l = a;
		float f = a;
		double d = a;
		char c = (char)a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		
	}
}