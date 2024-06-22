package Array_Program;

// 
public class ArryaEachNoEvenOrOdd {

	public static void main(String[] args) {
		
		int a [] = {2,4,5,7,6,8};
		int esum =0;
		int osum =0;
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2 ==0)
			{
				esum = esum+a[i];
			}
			else {
				osum = osum +a[i];
			}
		}
		System.out.println("sum of even : "+esum);
		System.out.println("sum of odd : "+osum);
	}
	
}
