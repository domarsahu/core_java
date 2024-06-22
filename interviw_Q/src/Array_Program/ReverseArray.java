package Array_Program;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr[]  = {1,2,3,4};
		
		for(int i =0 ; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// reverse order array

		int i = 0 ;
		int j = arr.length-1;
		int t;
		
		while(i<=j)
		{
			t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
			
			
		}
		
	//	System.out.println(Arrays.toString(arr));
		
		for( i =0 ; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
		
	}
	
	

}



