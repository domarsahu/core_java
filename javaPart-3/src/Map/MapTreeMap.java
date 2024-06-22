package Map;

import java.util.TreeMap;

public class MapTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap tm= new TreeMap();
		tm.put(1,1);
		tm.put(2,"rahul");
		tm.put(3,1985794);
		
		System.out.println(tm);
		
		TreeMap tm1 = new TreeMap();
		
		//put method for adding  key, values
		tm1.put(4, "rahul");
		tm1.put(5, 4544651546l);
		tm1.put(6, false);
		
		
		System.out.println(tm1.containsValue(45));
		System.out.println(tm1.containsKey(4));
		
		System.out.println("=====================");
		// remove(key) method delete the values
		tm.remove(2);
		System.out.println(tm);
		
		// putAll method All the key, values add
		tm1.putAll(tm);
		System.out.println(tm1);
		
		// putAll(values) method All the key, values add
		tm.putAll(tm1);
		System.out.println(tm1);
		
		//get(key) access the valus
		System.out.println(tm1.get(4));
		
		System.out.println(tm1.values());
		
		System.out.println(tm1.keySet());
		
		System.out.println(tm1.entrySet());
		
		System.out.println(tm1.size());
		
		tm1.clear();
		System.out.println(tm1);
	}

}
