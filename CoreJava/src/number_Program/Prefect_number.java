package number_Program;

// 6 ==> 1 2 3 multiple   or divide   ,,  1+ 2+ 3 => 6

public class Prefect_number {

	public static void main(String[] args) {
		
		int num = 6; 
		int temp = num ;
		int sum = 0;
		for(int i =1 ; i<num ; i++)
		{
			if(num%i ==0)
			{
				sum = sum +i;
			}
		}
		num = temp;
		if (temp == sum)
		{
			System.out.println("Prefect number ");
		}
		else
		{
			System.out.println("not prefect number ");
		}
	}
}
