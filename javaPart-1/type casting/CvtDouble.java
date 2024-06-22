// WAJP to convert the double value(56.09) into int type and print it.

class CvtDouble
{
	public static void main(String[] args)
	{
		double d = 56.09;
		int a =(int) d;

		System.out.println(d); // 56.09
		System.out.println(a); // 59 [data loss]
	}
}