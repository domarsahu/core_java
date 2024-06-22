package Array_25;

import java.util.Scanner;

// find the 3 maxmum array 

public class ThridMaxNumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,6,7,7,8,9};
		
		int n = 3;
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i]<a[j]) {  /// maxmum number 
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			if(a[i]==n-1) {
				System.out.println(n+"  max : "+a[n]);
			}
		}
		
		
	}

}
	