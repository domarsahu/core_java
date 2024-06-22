package LinkedLIst_pcg;

import java.util.LinkedList;


public abstract class A {
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add("Domar");
		l.add(4545);
		l.add('d');
		
		for(Object o : l)
		{
			System.out.println(o);
		}
		
	}

}
