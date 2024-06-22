package String__2_pro;

import java.util.Iterator;

public class Occurence_A2b3c1d2 {
	
	public static void main(String[] args) {
		
		String s  = "aabcbcdd";
		
		char [] s1 = s.toCharArray();
		
		char []s2 = s1.clone();
	
		for(int i = 0 ; i<s2.length; i++) {
			int c =0;
			for(int j =0; j<s2.length; j++) {
				
				if(s1[i]==s2[j]) {
					c++;
					s2[j]= '\0';
				}
				
			}
			if(c>0) {
				System.out.print(s1[i]+""+c);
			}
		}
		
		
	}
	
	

}
