package Array_Program;

import java.util.HashSet;

public class Comman2Array {
	public static void main(String[] args) {
		
		int arr1[] = {2,3,3,4,4,7,9,8};
		int arr2[] = {2,3,4,7,6,8,8,9,};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0;i<arr1.length; i++)
		{
			for(int j =0 ; j<arr2.length ; j++ )
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
				}
			}
		}
		for(int no : hs)
		{
			System.out.print(no+ ", ");
		}
	}

}
