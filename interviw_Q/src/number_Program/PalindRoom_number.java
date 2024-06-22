package number_Program;

// palindroom number   121 ==> reverse 121


public class PalindRoom_number {
	public static void main(String[] args) {
		
		int num = 122;
		int temp = num;
		int rev = 0;
		while(num !=0)
		{
			int rem = num%10;
			 rev = rev *10 +rem;
			num = num/10;
		}
		num = temp;
		if (temp == rev)
		{
			System.out.println("given number is palindroam number ");
		}
		else
		{
			System.out.println("not palindroom ");
		}
		
	}

}
