package number_Program;

public class Sum_allDigit {
	public static void main(String[] args) {
		int num = 583;
		int sum = 0;
		while(num !=0)
		{
			int rem = num%10;
	
			num = num/10;
			sum = sum+rem;
			
			
			System.out.print(rem);
		
		}
		System.out.println();
		System.out.println("sumation " +sum);
		
	}
}
