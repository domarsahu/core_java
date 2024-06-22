package patterns;

public class Pattern_A {
	
	public static void main(String[] args) {
	
		for (int i = 1; i <=5 ; i++)
		{
			for(int j = 1 ; j <=20 ; j++)
			{
				if ((i==1 && j ==12) || (i==2 &&j==10) || (i==2 && j==14) 
						|| (i==3 && j==8) || (i==3 && j==16)|| (i==4 && j==6) ||
						(i== 4 && j==8) || (i==4 && j==10) || (i==4 && j==12) ||
						(i==4 && j==14) || (i==4 && j==16)|| (i ==4 && j ==18)
						|| (i==5 && j==4) || (i==5 && j==20))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			System.out.println();
			
		}
	}
}
