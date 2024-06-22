package Array_practice;

public class AccendingOrderSorting {
	public static void main(String[] args) {
		
		int a[] = {1,3,4,5,9,6,8,7};
		System.out.println("Accending Order");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = i+1 ; j<a.length ; j++)
			{
				if(a[i]> a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.print(+a[i]+" ");
		}
		
//		for(int i =0 ; i<a.length; i++)
//		{
//		}
//		
	}

}
