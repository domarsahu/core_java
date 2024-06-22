package LInkedList;

import java.util.LinkedList; 

public class Alist {
	
	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		
		l.add("domar");
		l.add(84);
		l.add('A');
		
		for(Object o : l)
		{
		
		System.out.println(l);
		}
		
		l.addLast(494);
		System.out.println(l);
		
		l.addFirst("ydodo");
		System.out.println(l);
		
		l.add(4, 'F');
		System.out.println(l);
		
		l.remove();
		
		System.out.println(l);
		
		
		System.out.println(l.get(2));
		System.out.println(l.size());
		
	}

}
