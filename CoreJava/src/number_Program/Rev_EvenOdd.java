package number_Program;

public class Rev_EvenOdd {
	
	public static void main(String[] args) {
		int num = 22355678;
		int count = 0;
		while(num !=0)
		{
			int rem = num %10;
			num = num /10;
			
			count ++;
			if (rem %2 ==0)
			{
				System.out.println("even " +rem);
			}
			else
			{
				System.out.println("odd " +rem);
			}
		
			
		}	
		System.out.println("count number  " +count);
	}

}
