package apnaclg;



/*public class Array {
	public static void main(String args[]) {	
		
	
	int mark[] = {93,33,07,30};
	
		int mark[] = new int[4];
		
		mark[0]=94;
		mark[1]=90;
		mark[2]=83;
	mark[3]=99;
		
	System.out.println(mark[0]);
	System.out.println(mark[1]);
	System.out.println(mark[2]);
	System.out.println(mark[3]);
		
		for(int i=0; i<4; i++) {
			System.out.println(mark[i]);
		}
		
	}

}*/


//#############################



/* import java.util.*;

public class Array{

public static void main (String args[]) {
	Scanner ss =new Scanner(System.in );
	int size = ss.nextInt();
	
	int number[] = new int[size];
	
	//input 
	for(int i =0; i<size ; i++) {
		number[i]= ss.nextInt();
	}
	
	//output
	   for (int i =0; i<size; i++) {
		  System.out.println(number[i]);
		
	}
	}

}
*/





///   ######################################################################

//Take an array of names as input from the user and print them on the screen.


/*import java.util.*;

public class Array{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		String name[]= new String[size];
		
		for(int i =0; i<size; i++)
		{
			name[i] = s.next();
		}
	   for(int i=0; i<name.length; i++) {
		System.out.println("name" +(i+1) + " is : " + name[i]);
	}
	
}
}
*/



//##########################################################################



//  Take an array as input form the user.Search for a given number x and print the index at which it occurs. 

/*import java.util.*;

public class Array{
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	
	int x  = s.nextInt();
	int number[]= new int[size];
	 
	for(int i =0; i<size; i++) {
		number[i] = s.nextInt();
	}
	for(int i=0 ;i<number.length; i++) {
		if(number[i] == x) {
		    System.out.println(" index x is :" + i);
	}
}

}
}
*/





//##############################################################################################



//Find the maximum & minimum number in an array of integers.


/*
import java.util.*;

public class Array{
	public static void main(String args[]) {
		Scanner sss =new Scanner(System.in);
		int min_max = sss.nextInt();
		
		int number[] = new int[min_max];
		
		for(int i=0; i<min_max;i++) {
			number [i] = sss.nextInt();
		}
		
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		
		
	    for(int i = 0; i<number.length; i++) {
	    	
	    	if(number[i]< min) {
	    		min = number[i];
	    	}
	     
	        if(number[i]< max) {
	        	max = number[i];
	        }

	    }
	    
	    System.out.println("Largeat number is : " + max);
	    
	    System.out.println("Smallest number is : " + min);
	    
	 }
}
*/






///##########################################################################################################



/* Takw an array of number as input and cheack if it is an array sorted in ascending order.

   EG:    {1,2,3,4,7} is sorted in ascending order.
          {4,3,6,1,6,} is not sorted in ascending order.
         */



import java.util.*;

public class Array{
	public static void main(String args[]) {
		Scanner sss = new Scanner(System.in);
		int sorr = sss.nextInt();
		
		int number[] = new int[sorr];
		
		
		//input
		
		for(int i=0; i<sorr; i++) {
			number[i] = sss.nextInt();
			}
		
		
		
		boolean isAscending = false;
		
		
		
		for(int i = 0; i<number.length-1; i++) {  //NOTICE number.length - 1 as termination condition 
			
			if(number[i] > number[i+1]) {   // This is the condition for descending order 
				
				
				isAscending =  true;
			}
			
		}
		
		if(isAscending) {
			
			System.out.println("The array is sorted in ascending order");
		}
		else {
			
			System.out.println("The array is not sorted in ascending order");
			
		}
			
			
				
	}
}








