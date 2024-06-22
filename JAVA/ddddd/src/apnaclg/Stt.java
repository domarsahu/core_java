package apnaclg;


//  Declrasion:-

/*public class Stt {
	public static void main(String args[]) {
		
	String name = "domar";
	String fname = "Bksahusssssssssssssssssssss";
	 
	String fulname = name + " " + fname;
	
	
	//charAt
	
	for(int i= 0 ; i<fulname.length(); i++) {
		System.out.println(fulname.charAt(i));
	}
	
	//lenght
	//System.out.println(fulname.length());
	}
}
*/





//#################################################################################################################



/*import java.util.*;

public class Stt{
	public static void main(String args[]) {
		Scanner sss = new Scanner(System.in);
		String name = sss.nextLine();
		
		System.out.println("your name is :" + name);
		
	}
}*/




//########################################################################################################################



/*import java.util.*;

public class Stt{
	public static void main(String args[]) {
		StringBuilder ss = new StringBuilder("Domar is very smart boy");
		
		
		//ss.insert(3, 'n');
		
		//ss.delete(1, 13);
		
		//System.out.println(ss.charAt(1));	
		
		//ss.append(" sahu");                   #  meanto add somthing at the end 
		
		System.out.println(ss);
		}
}
*/




//##################################################################################################################


//Compare 2 string 

/*public class Stt{
	public static void main(String args[]) { 
	//  String n = "Domar";
	//	String m = "Domarp";
		
		//if(n == m) {
		
		//if(n.equals(m)) {
		
		
		//Give increact answer here
		//if(new String("Domar") == new String("Domar")) {
			
			System.out.println("they are some String :");
		}else {
			System.out.println("they are not some String :");
		} 
	}
}*/





//##############################################################################################

// Take an array of String input from the use & find the cumulative(cobined) length of all those strings.



/*import java.util.*;

public class Stt{
	public static void main(String arg[]) {
		Scanner ss = new Scanner(System.in);
		int size = ss.nextInt();
		
		String arry[] = new String[size];
		
		int t = 0;
		
		
		for(int i=0; i<size; i++) {
			arry[i] = ss.next();
			
			//Subko add karake length nikarl raha hai.
			t += arry[i].length();
		}
		
		System.out.println(t);
	}
		
}
*/





//###########################################################################################################


//Input a string from the user.Create a new string called 'result' in which you will replace the letter 'e' 
//                           in the original string with letter 'i'..


/*import java.util.*;

class Stt{
	public static void main(String args[]) {
		Scanner ss = new Scanner(System.in);
		String sie = ss.next();
		
		String result =" ";
		
		
		for(int i=0; i<sie.length(); i++) {
			
			if(sie.charAt(i) == 'e') {
			
			result += 'i';                    // means :-    result = result + 'i';
		} else {
			result += sie.charAt(i);
		
			
		}
		
		
	}
		System.out.println(result);
	
}
}                              //output:        adfaeafeee
                                       //       adfaiafiii

*/




//#############################################################################################################


/*Input an email from the user.You have to create a username from the email by deleting the part that comes
        afterr '@' .Display that usename to the user.
EG:-
email = "domarsahu0863@gmail.com" ;  username = "domarsahu0863"
*/

/*
import java.util.*;

public class Stt{
	public static void main(String args[]) {
		Scanner ss= new Scanner(System.in);
		String email = ss.next();
		String username =" ";
		
		System.out.println("email : " + email);
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '@') {
				break;
			}
		
		else {
			username += email.charAt(i);
		  }
		}
          System.out.println("username : " + username);
	}
	
} */                          /*    Output :-        domar@2001
                                                     email : domar@2001
                                                     username :  domar  */




//###############################################################################################################




