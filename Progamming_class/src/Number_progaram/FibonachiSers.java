package Number_progaram;

public class FibonachiSers {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		for(int i = 1; i<=10;i++)
		{
			if (n1%2!=0) {
				System.out.println(n1);
			}
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
	}

}
