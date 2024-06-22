/* create a grade system 
100 - 90 a+
89-80    a 
80 - 70  b 
70 - 55  c 
35 - 54  d
<35      f

*/

class CreateGrade
{
	public static void main(String[] args)
	{
		int a = 59;
		if(90 <=a && a<=100)
		{
			System.out.println("Given Grade is A+ ");
		}
		else if (a<=89 && 80<=a)
		{
			System.out.println("Given Grade is A ");
		}
		else if (a <=80 &&  a>=70)
		{
			System.out.println("Given Grade is B");
		}
		else if(a<=70 && a>=55)
		{
			System.out.println("Given Grade is C");
		}
		else if (a<=35 && a>= 54)
		{
			System.out.println("Given Grade is D");
		}
		else {
			System.out.println("Given Grade is F");
		}


	}

}