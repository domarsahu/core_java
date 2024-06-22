package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("doamr");
		a.add(84);
		a.add('A');
		
		
		for(Object o : a)
		{
			System.out.println(o);
		}
		
		System.out.println(a);
		
		// get karega 
		System.out.println(a.get(2));
		
		// ek or element   add(index, element)   karega
		a.add(3,"rahul");
		System.out.println(a);
		
		
		//set element ( ek elment ke jagaha par new element aa jayega )
		a.set(2, 4);
		System.out.println(a);
		
		//delete element And remove element remove(index);
		a.remove(3);
		System.out.println(a);
		
		// size() element 
	//	int size = a.size();
		
		
		System.out.println("size : "+a.size());
		
		
		for (Object o : a)
		{
			System.out.println(o);
		}
		System.out.println();
		
		//sorting
		
		Collections.sort(a);
	}
}

