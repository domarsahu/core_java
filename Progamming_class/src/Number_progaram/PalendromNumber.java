package Number_progaram;

public class PalendromNumber {
	
	public static void main(String[] args) {
		int num =121;
		int temp = num;
	//	int sum=0;
		int rev = 0;
		
		while(num!=0)
		{
			int rem= num%10;
			
			rev = rev*10+rem;
			
			num = num/10;
		}
	//	sum = sum+rev;
		num = temp;
		
		if(num == rev)
		{
			System.out.println("palendrom number "+rev);
		}
		else {
			System.out.println("not palendrom number "+num);
		}
	}

}
