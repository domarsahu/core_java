package String__2_pro;

// co

public class AB1BC2DE3 {
	public static void main(String[] args) {
		
		String s = "Ab1bc2cd3";
		int sum=0;
		char []c =s.toCharArray();
		int count=0;
		for(int i =0 ; i<c.length;i++) {
			
		
			if('0'<=c[i] && '9'>=c[i]) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
