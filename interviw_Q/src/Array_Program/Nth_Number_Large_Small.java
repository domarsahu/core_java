package Array_Program;

// nth  Largest and smallest Number  
// acending and decending number 

public class Nth_Number_Large_Small {
	public static void main(String[] args) {
		
		int a[]= {1,5,50,3,204,45};
		int temp;
		int nth = 3;
		// array print 
		System.out.print("Given array is : ");
		for(int i = 0; i<a.length ; i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		
	// 2nd Lagest Number & deacending order : 
		for(int i = 0 ; i<a.length;i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] < a[j]) 
				{
					temp= a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i==nth-1)    // 2nd ke bad break kar deaga
			{
				System.out.print("Second largest number :  " +a[i]);
				//break;
			}
			
		}                                   // 2nd largest
		System.out.println();
		System.out.print("Deacending Order : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print( a[i]+ " ");
		}
		System.out.println();
		System.out.println();
		
		
		
// 2nd smallest Number &	acending order : 
		for(int i = 0 ; i<a.length;i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] > a[j]) 
				{
					temp= a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i==nth-1)    // 2nd ke bad break kar deaga
			{
				System.out.print("Second Smallest number :  "+a[i]);
				//break;
			}
			
		}     // 2nd smallest means 2-1 = 1, 4th-1=3
		System.out.println();
		System.out.print("acending Order : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print( a[i]+ " ");
		}
	}
	

}
