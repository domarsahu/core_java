package final_mock;

import java.util.TreeMap;

// Create a TreeMap including duplicate print only all the key

public class CreateTreeMap {
	
	public static void main(String[] args) {
	
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	
	tm.put(1, "Doamr");
	tm.put(2, "Doamr");
	tm.put(3, "ghanu");
	tm.put(4, "rahul");
	
	System.out.println(tm.keySet());
	
	}

}
