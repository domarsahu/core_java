package Map;

import java.util.LinkedHashMap;

public class MapLinkedHashMap {
	
	public static void main(String[] args) {
		
	
		LinkedHashMap lm= new LinkedHashMap();
		lm.put(1,45);
		lm.put(2,"domar");
		lm.put(3,43.455);
		
		System.out.println(lm);
		
		LinkedHashMap lm1 = new LinkedHashMap();
		
		//put method for adding  key, values
		lm1.put(4, "rahul");
		lm1.put(5, 454546);
		lm1.put(6, true);
		// putAll method All the key, values add
		lm1.putAll(lm);
		System.out.println(lm1);
		System.out.println(lm.containsValue(45));
		System.out.println(lm1.containsKey(4));
		
		System.out.println("=====================");
		// remove(key) method delete the values
		lm.remove(2);
		System.out.println(lm);
		// putAll(values) method All the key, values add
		lm.putAll(lm1);
		System.out.println(lm1);
		
		//get(key) access the valus
		System.out.println(lm1.get(4));
		
		System.out.println(lm1.values());
		
		System.out.println(lm1.keySet());
		
		System.out.println(lm1.entrySet());
		
		System.out.println(lm1.size());
		
		lm1.clear();
		System.out.println(lm1);
	}

}
