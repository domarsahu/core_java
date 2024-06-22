package number_Program;

// prime number is divide by itself    just like 5, 7, 13 etc..

public class Prime_number {
	
	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		for (int i =1 ; i<=num ; i++)
		{
			if(num%i ==0) 
			{
				count ++;
			}
		}
		if (count ==2)
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("not prime number ");
		}
	
	}

}
