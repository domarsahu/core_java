package Boxing;

public class Demo {
	
	public static void main(String[] args) {
		
		Integer i = 8 ;  // autoboxing
		
		int p= i;// autounboxing
		
		System.out.println(i);
		
		System.out.println(p);
	
		
		Integer ii = new  Integer(8);
		int iiii = ii;                  // autounboxing
		System.out.println(iiii);
		
		
		String s = "444";
		int res1 = Integer.parseInt(s);
		System.out.println(res1);
	
		
		String s1 = "TrUE";
		boolean res2= Boolean.parseBoolean(s1);
		System.out.println("Boolean  " +res2);
		
		
		String s3= "498050.445";
		double res3 = Double.parseDouble(s3);
		System.out.println("Double  "+res3);
		
		
		
		
		
		
	}

}
