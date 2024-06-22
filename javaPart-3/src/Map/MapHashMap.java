package Map;

import java.util.*;

public class MapHashMap {
	
	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		hm.put(1,45);
		hm.put(2,"domar");
		hm.put(3,43.455);
		
		System.out.println(hm);
		
		HashMap hm1 = new HashMap();
		
		//put method for adding  key, values
		hm1.put(4, "rahul");
		hm1.put(5, 454546);
		hm1.put(6, true);
		// putAll method All the key, values add
		hm1.putAll(hm);
		System.out.println(hm1);
		System.out.println(hm.containsValue(45));
		System.out.println(hm1.containsKey(4));
		
		// remove(key) method delete the values
		System.out.println("=====================");
		hm.remove(2);
		System.out.println(hm);
		// putAll(values) method All the key, values add
		hm.putAll(hm1);
		System.out.println(hm1);
		
		//get(key) access the valus
		System.out.println(hm1.get(4));
		
		System.out.println(hm1.values());
		
		System.out.println(hm1.keySet());
		
		System.out.println(hm1.entrySet());
		
		System.out.println(hm1.size());
		
		
		System.out.println(hm1.isEmpty());
		
		hm1.clear();
		System.out.println(hm1);
		
	}

}
