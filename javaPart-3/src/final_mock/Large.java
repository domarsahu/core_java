package final_mock;

public class Large {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		String res =(a>b) ? ((a>c)? "a is grether" : "c is grater " ): ((b>c) ? "b is grether " : "c is grater");
		
		System.out.println(res);
	}

}
