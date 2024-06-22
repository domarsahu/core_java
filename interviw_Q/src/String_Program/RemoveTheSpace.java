package String_Program;

public class RemoveTheSpace {
	
	public static void main(String[] args) {
		
		String str = "hello world ughifj fkjghdn fkjgfn";
		
		System.out.println(str);
		
		String s2="";
		for(int i =0 ;i<str.length(); i++) {
			
			if(str.charAt(i)!=' ') {
				s2=s2+str.charAt(i);
			}
		}
		System.out.println(s2);
			
		}
	}

	
	


