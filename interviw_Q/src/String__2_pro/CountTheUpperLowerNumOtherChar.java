package String__2_pro;

public class CountTheUpperLowerNumOtherChar {
	public static void main(String[] args) {
		
		String s ="DoamrSjkndf@24^&*JFHdjfnd$$$";
		int upp = 0, low=0, num=0, other=0;
		
		for(int i= 0 ; i<s.length(); i++)
		{
			char s1 = s.charAt(i);
			
			if(s1>=65 && s1<=90)
			{
				upp++;
			}
			else if(s1>=97 && s1<=122)
			{
				low++;
			}
			else if (s1>=48 && s1<=57)
			{
				num++;
			}
			else {
				other++;
			}
			
		}
		
		System.out.println("upper charcter : "+upp);
		System.out.println("lower charcter : "+low);
		System.out.println("number : "+num);
		System.out.println("other charcter : "+other);
		
	}
	

}
