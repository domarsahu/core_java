// WAJP the number is diviable by 6 or not.  you can't use modules by %6 

class DivBy6withoutMo
{
	public static void main(String[] args)
	{
		int n =9;
		if(n>=6 && n%2 == 0 && n%3==0)
		{
			System.out.println(n+" is diviable by 6");
		}else{
		System.out.println(n+" is not diviable by 6");
		}
	}
}