package Array_Program;

public class RemoveDuplicateElementInArray {
	public static void main(String[] args) {
		int a[] = {2,2,4,6,7,2,2,2,2,4,9,7,6};
		
		int k =0;
		
		for(int i=0; i<a.length; i++) {
			int j;
			for(j=0; j<i ; j++) {
				
				if(a[i]==a[j]) {
					break;
				}
			}
			if(i==j) {
				a[k++] = a[i];
			}
		}
		
		for(int i =0 ; i<k ; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
