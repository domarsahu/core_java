package String__2_pro;

public class OccuranceOfString {
	public static void main(String[] args) {
		
		String s= "Doma585u49986rDaomarsahu";
		
		char [] ch = s.toCharArray();
		
		char [] c = ch.clone();
		
		for(int i = 0 ; i<c.length; i++)
		{
			int count =0;
			for(int j =0; j<c.length ; j++)
			{
				if(ch[i] == c[j]) {
					count++;
					c[j] = '\0';  //undeind character
					
				}
			}
			if(count>0) {
				//System.out.println("occurence : "+ch[i] + " , count : "+count);
				System.out.print(ch[i] +""+count);
			}
		}
		
	}
	

}
