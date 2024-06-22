package patterns_Demo;

public class dimandStar {
	public static void main(String[] args) {
		
		int a =1;
		for(int i = 1 ; i<=4 ; i++) {
			
			for (int j = 4-i; j>=1;j--) {
				System.out.print(" ");
			}
			for(int k =1; k<=i;k++) {
				
				if(a%2==0) {
					System.out.print(0+" ");
				}
				else {
					
					System.out.print(1+" ");
				}
				a++;
			}
			System.out.println();
		}
	}

}
