package number_Program;

// count number of digits

public class Count_number2 {
	
	public static void main(String[] args) {
		
		int num = 345632;
		int count = 0;
		
		while(num !=0)
		{
			int rem = num%10;
			
			num = num/10;
			count++;
			
		}
		System.err.println(count);
	}
	

}
