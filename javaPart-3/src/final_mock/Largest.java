package final_mock;

public class Largest {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		String res =(a>b)?((a>c)?"a greater": "c is greater") : ((b>c)? "b is greater ": "c greater" );
		
		System.out.println(res);
	}

}
