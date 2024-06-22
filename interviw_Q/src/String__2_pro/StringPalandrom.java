package String__2_pro;

public class StringPalandrom {
	public static void main(String[] args) {
		
		String s ="nan";
		
		String s2 ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			s2=s2+s.charAt(i);
		}
		
		if(s.equals(s2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
