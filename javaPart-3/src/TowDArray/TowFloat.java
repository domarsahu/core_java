package TowDArray;

public class TowFloat {
	
	public static void main(String[] args) {
		
		float f[][] = {{2.3f,56.7f},{3.0f, 34.3f}};
		
		for(int i =0 ; i<f.length;i++)
		{
			for(int j =0 ; j<f.length;j++)
			{
				System.out.println(f[i][j]);
			}
		}
	}

}
