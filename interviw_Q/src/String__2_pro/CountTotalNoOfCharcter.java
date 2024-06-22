package String__2_pro;

// count the total number of charcter in String

// count the space 

public class CountTotalNoOfCharcter {
	public static void main(String[] args) {
		String s = "hello i am domar sahu h"; 
		int count =0;
		int space=0;
	
		for(int i = 0 ; i<s.length(); i++)
		{
			char s1=s.charAt(i);
			// count the charcters
			if(s1 != ' ')
			{
				count++;
			}
			// count the space
			else {
				space++;
			}
		}
		System.out.println("count the charcter "+count);
		System.out.println("count the space "+space);
	}
	

}
