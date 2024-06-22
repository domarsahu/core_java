package number_Program;

// special number  145 ==> 5! + 4! + 1! ==> 120 + 24+ 1 ==> 145

public class Special_number {
	public static void main(String[] args) {
		
		int num = 145;
		int sum = 0;
		int temp = num ;
		while(num != 0)
		{
			int rem = num %10;
			
			int f = 1;
			for(int i =1 ; i<= rem ; i++)
			{
				f = f*i;
			}
			sum = sum + f;
			num  = num/10;
		}
		num = temp;
		if(temp == sum)
		{
			System.out.println("Spical Number ");
		}
		else
		{
			System.out.println("not spical Number ");
		}
	}

}
