package Map;

import java.util.Hashtable;

public class MapHashTable {
	
	public static void main(String[] args) {
		

		Hashtable ht= new Hashtable();
		ht.put(1,45);
		ht.put(2,"domar");
		ht.put(3,43.455);
		
		System.out.println(ht);
		
		Hashtable ht1 = new Hashtable();
		
		//put method for adding  key, values
		ht1.put(4, "rahul");
		ht.put(5, 454546);
		ht.put(6, true);
		// putAll method All the key, values add
		ht.putAll(ht);
		System.out.println(ht);
		System.out.println(ht.containsValue(45));
		System.out.println(ht.containsKey(4));
		
		// remove(key) method delete the values
		ht.remove(2);
		System.out.println(ht);
		// putAll(values) method All the key, values add
		System.out.println("=====================");
		ht.putAll(ht);
		System.out.println(ht1);
		
		//get(key) access the valus
		System.out.println(ht1.get(4));
		
		System.out.println(ht1.values());
		
		System.out.println(ht1.keySet());
		
		System.out.println(ht1.entrySet());
		
		System.out.println(ht1.size());
		
		ht1.clear();
		System.out.println(ht1);
	}

}
