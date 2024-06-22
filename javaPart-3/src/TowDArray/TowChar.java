package TowDArray;

public class TowChar {
	
	public static void main(String[] args) 
	{
		char c[] [] = {{'a','D'},{'S','e'}};
	
		System.out.println(c[0][1]);
		
		for(int i =0 ; i<c.length;i++)
		{
			for(int j =0 ; j<c.length;j++)
			{
				System.out.println(c[i][j]);
			}
		}

	}
}
