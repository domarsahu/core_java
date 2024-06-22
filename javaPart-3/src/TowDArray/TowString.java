package TowDArray;

public class TowString {
	
	public static void main(String[] args) {
		
	String s[][] = {{"domar", "rahul"},{"nitish","ghanshyam"},{"venky", "sumi"}};
	
		for(int i =0 ; i<s.length;i++)
		{
			for(int j =0 ; j<s[i].length;j++)
			{
				System.out.println(s[i][j]);
			}
		}
	}

}
