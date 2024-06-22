package HashSet;

import java.util.*;

public class SetHashSet {
	
	public static void main(String[] args) {
	
		//HashSet  
		Set sh = new HashSet();
		sh.add(45);
		sh.add("doamr"); 
		sh.add(454.45);
		sh.add(null);
		sh.add(null);
		sh.add("doamr"); 
		System.out.println(sh);
		
		
		// TreeSet
		Set st = new TreeSet();
		st.add(45);
		//st.add("doamr"); 
		st.add(4534);
		//st.add(null);
	//	st.add(null);
		st.add(3434); 
		System.out.println(st);
		
		
		
		//LinkedHashSet
		Set sl = new LinkedHashSet();
		sl.add(45);
		sl.add("doamr"); 
		sl.add(454.45);
		sl.add(null);
		sl.add(null);
		sl.add("doamr"); 
		System.out.println(sl);
		
	}

}
