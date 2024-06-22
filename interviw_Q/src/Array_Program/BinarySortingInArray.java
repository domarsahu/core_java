package Array_Program;

public class BinarySortingInArray {
	public static void main(String[] args) {
		int a[] = {2,3,4,5,9,6,20,7,8,9};
		
		
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i]>a[j]) {  /// maxmum number 
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		int start = 0;
		int end =a.length-1;
		int n =15;
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(a[mid] ==n ) {
				System.out.println("n is present in given array");
				break;
			}
			else if(a[mid] < n) {
				start = mid + 1;
			}else {
				end = mid -1;
			}
		}
	}
	

}
