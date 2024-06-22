package final_mock;

// create a creacter array and used the charecter convert uppercase char into lowercase and print update

public class CharecterArray {

	public static void main(String[] args) {
		char ch [] = {'A', 'S', 'F', 'D'};
		for(int i = 0; i<ch.length; i++)
		{
			
		//	char c = Character.toLowerCase(ch[i]);
			
			if(65<= ch[i]  && 90>= ch[i])
			{
				ch[i] +=32;
				
		//		System.out.print(ch[i]+ " ");
			}
			System.out.print(ch[i] + " ");
		}
	}
}
