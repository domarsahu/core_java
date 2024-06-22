package final_mock;

// Convert boolean type String into boolean

public class ConvertBoolean {
	
	public static boolean parseBoolean(String s)
	{
		System.out.println(s);
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("i am main");
		
		parseBoolean("true");
		
		boolean b = Boolean.parseBoolean("false");
		System.out.println(b);
	}

}
