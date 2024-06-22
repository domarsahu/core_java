package patterns;

public class Patten_B {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=12 ; i++)
		{
			for(int j =1 ; j <=11 ; j++)
			{
				if(i==1 || (i==2 && j==1) || (i==2&&j==11) || (i==3 && j==1)
						|| (i==3 && j==11)|| (i==4 && j==1) || (i==4 && j==11)
						|| (i==5 && j==1) || (i==5 && j==11)
						|| (i==6 && j==1) || (i==6 && j==11) || (i==7 && j==1) || (i==7 && j==11)
						|| (i==8 && j==1) || (i==8 && j==11) || (i==9 && j==1) || (i==9 && j==11)
						|| (i==10 && j==1)|| (i==10 && j==11) || i==6 || i ==11 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
