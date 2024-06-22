package String__2_pro;

import java.util.Iterator;

/*    Reverse the every word in string .
      EX:-   domar sahu   --->reverse-->>    ramod uhas
*/
public class Reverse_Ever_Word {
	public static void main(String[] args) {
		
		String s = "domar sahu";
		
		String[] word = s.split(" ");
		 System.out.println("given String is : "+s);
		String revString=" ";
		for(int i = 0 ; i<word.length; i++)
		{
			String w = word[i];
			String revWord = " ";
			
			for(int j = w.length()-1 ; j>=0 ; j--) 
			{
				revWord = revWord  + w.charAt(j);
			}
			
			revString = revString + revWord;
		}
		
		System.out.println(revString);
	}

}
