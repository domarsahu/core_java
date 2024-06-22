// WAJP the number is diviable by 6 or not.  you can't use modules by %6 

class DivBy6withoutMo
{
	public static void main(String[] args)
	{
		int n =36;
		
		String res = n>=6 && n%2 == 0 && n%3==0 ? "yes" : "no";
		System.out.println(res);
	}
}