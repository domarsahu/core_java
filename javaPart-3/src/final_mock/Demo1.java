package final_mock;

public class Demo1 {
	public static void main(String[] args) {
		
		char [] ch= {'a','b','C','D','e','F'};
		
		System.out.println("given charecter ");
		int i;
		
		for( i =0; i<ch.length; i++)
		{
			System.out.println(ch[i]+ " ");
		}
		
		for( i =0; i<ch.length; i++)
		{
			if(65 <=ch[i] && 90 >= ch[i])
			{
				ch[i] +=32;
				System.out.println("upper case " +ch[i]);
			}
			else if(97 <=ch[i] && 122 >=ch[i])
			{
				ch[i] -=32 ;
				System.out.println("lowe case " +ch[i]);
			}
		}
		System.out.println("update chareter");
		System.out.println(ch[i]+ " ");
	}

}
