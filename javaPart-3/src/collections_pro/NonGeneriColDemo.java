package collections_pro;

import java.util.*;

public class NonGeneriColDemo {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.hashCode());
		System.out.println(c.add(5));
		c.add("Rahul");
		c.add('a');
		c.add(true);
		c.add(78.7);
		System.out.println(c);
		System.out.println("=====================");
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("Rahul"));
		
		Collection c1 =new ArrayList();
		c1.add(56);
		c1.add(78);
		c1.add("ram");
		
		System.out.println("hasshhshhhs" + c.hashCode());
		c1.add(c); 
		System.out.println(c1);
		System.out.println(c1.containsAll(c));
		Collection c2 = new ArrayList();
		c2.addAll(c);
		c2.addAll(c1);
		System.out.println(c2);
		Collection c3 =new ArrayList();
		c3.addAll(c1);
		c3.addAll(c2);
		c3.addAll(c);
		System.out.println(c3);
		
		c3.remove("ram");
		c3.retainAll(c);
		c3.removeAll(c1);
		c3.clear();
		
		System.out.println(c3);
		
		
	}

}
