package Array_24;

public class ReverseOfArray {
	public static void main(String[] args) {
		int [] a= {2,3,4,5,6,7,8};
		
		int i=0;
		int j =a.length-1;
		while(i<j) {
		 
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;	
			i++;
			j--;
		}
		for(int k =0 ; k <a.length;k++) {
			System.out.print(a[k]+ " ");
		}
	}

}
