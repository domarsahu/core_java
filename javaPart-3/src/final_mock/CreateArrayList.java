package final_mock;

import java.util.ArrayList;

public class CreateArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(4);
		ar.add(2);
		ar.add(3);
		
		System.out.println(ar);
		
		System.out.println(sort(ar));
	}
}
