package number_Program;

/*    spy number  6 ==> 1 + 2+ 3 => 6  (sum)
 *                6 ==> 1 * 2*3  => 6  (product)
                  sum == pro
 */
public class Spy_Number {
	public static void main(String[] args) {
		
		int num = 123;
		int sum = 0;
		int pro = 1;
		
		while(num !=0)
		{
			int rem = num %10;
			sum = sum +rem;
			pro = pro *rem;
			num = num/10;	
		}
		
		if (sum == pro)
		{
			System.out.println("spy number ");
		}
		else 
		{
			System.out.println("not spy number");
		}
	}
	
}
