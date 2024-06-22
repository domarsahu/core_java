package String__2_pro;

// Remove the non alphabets  in String 

public class RemoveNonAlphabets {
	public static void main(String[] args) {
		String  s="hello45889jfjd4j13@#$%";
		
		String s2 ="";
		
		for(int i = 0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if((c>=65 && c<=90) || (c>=97 && c<=122))
			{
				s2 = s2+c;
			}
			
			
		}
		System.out.println(s2);
	}
	
}
