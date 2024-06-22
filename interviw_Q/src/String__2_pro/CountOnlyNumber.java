package String__2_pro;

public class CountOnlyNumber {
	public static void main(String[] args) {
		String s = "ab1cd2ef3";
		//char ch[] = s.toCharArray();
		int sum =0;
		for(int i = 0 ; i<s.length(); i++)
		{
			char s1 = s.charAt(i);
			
			if(s1>=48 && s1<=57)
			{
				sum =sum+(s1-48);
			}
		}
		System.out.println("sum the number : "+sum);
		
		
	}

}
