package Array_Program;

import java.util.HashSet;

public class RemoveDublicate {
	public static void main(String[] args) {
		int [] a= {2,44,5,6,77,88,5,44,5};
		
		HashSet<Integer> hs = new HashSet();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		for(int no : hs)
		{
			System.out.print(no+" ");
		}    
		
//		if(a.length==0 || a.length==1)
//		{
//			System.out.println(a.length);
//		}
//		int[] temp =new int[a.length];
//		
//		int j =0;
//		for(int i =0; i<a.length-1;i++)
//		{
//			if(a[i] != a[i+1])
//			{
//				temp[j++] = a[i];
//				//j++;
//			}
//		}
//		a[j++] = a[a.length-1];
//		for(int i = 0; i<j; i++) {
//			a[i] =temp[i];
//			
//		}
//		for(int i=0; i<a.length -1; i++)
//		{
//			System.out.print(a[i] + " ");
//		}
	}

}
