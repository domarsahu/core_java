package TowDArray;

public class TwoBoolean {
	
	public static void main(String[] args) {
		boolean b[][] = new boolean[2][2];
		
		b[0][1] = true;
		b[1][0]= true;
		b[1][1]= false;
		b[0][0]= true;
		// by default false hoga
		
		
		for(int i =0 ; i<b.length;i++)
		{
			for(int j =0 ; j<b.length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
	}

}
