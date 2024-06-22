package number_Program;

//583  ==>  385

public class Reverse {
	
	public static void main(String[] args) {
		int num = 583;
		
		while(num !=0)
		{
			int rem = num%10;
	
			num = num/10;
			System.out.print(rem);
		}
	}

}
