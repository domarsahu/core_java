package number_Program;

/* Amstring Number 153 ==> count all digit 3  and all digit power 
    like       3*3*3 + 5*5*5 + 1*1*1  ==> 27 + 125 + 1 ==> 153
*/
public class Amstrong_Number {
	public static void main(String[] args) {
		
		int num = 153;
		int count =0;
		int sum = 0;
		int power = 0;
		int temp = num;
		
		while(num !=0)
		{
			int rem = num %10;
			num = num/ 10;
			count ++;
		}
		num = temp;
		
		while(num != 0)
		{
			int rem = num %10;
			int pro = 1;
			for(int i =1 ; i<=count ; i++)
			{
				pro = pro *rem;
			}
			sum = sum +pro; 
			num = num/10;
			
		}
		num = temp;
		if (temp == sum)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not Amstrong number ");
		}
		
	}

}
