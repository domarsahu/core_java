package String_Program;

// Remove the Dublicate charater in String ;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String s="jaava javabst hii Domar dSahu";
		
		char[] str =s.toCharArray();
		
		int len = str.length;
		int k = 0;
		
		for(int i=0 ; i<len ; i++) {
			int j;
			
			for(j=0; j<i ; j++) {
				if(str[i] == str[j]) {
					break;
				}		
			}
			//System.out.println(j);
			if(j==i) {
				str[k++] = str[i];
//				System.out.println(j);
//				System.out.println("k "+k);
//				System.out.println("i "+i);
			}	
		}
		for(int i =0 ; i<k ; i++) {
			System.out.print(str[i]+"");
		}
		
	}

}
