package NumberProgaram;

public class StronNumber {
	public static void main(String[] args) {
		System.out.println("hii");
		int num = 121;
		int temp = num;
		int sum= 0;
		
		while(num !=10)
		{
			int rem = num%10;
			
			int f = 1;
			for(int i = rem; i>0 ; i++)
			{
				f = f*i;
			}
			
			sum = sum+f;
		}
		
		num = temp;
		
		if(num == temp)
		{
			System.out.println("Strong number ");
		}
		else {
			System.out.println("not strong number ");
		}
		
	}

}
