package patterns_Demo;
/*
		*
	   **
	  ***
	 ****
*/
public class P1 {
	public static void main(String[] args) {
		
		for(int i =1; i<=4; i++) {
			for(int j= 1; j<3;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
