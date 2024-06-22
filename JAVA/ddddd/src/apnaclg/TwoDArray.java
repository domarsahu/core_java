package apnaclg;

/* public class TwoDArray {
	public static void main(String args[]) {
		int [] [] number = new int[2][3];
		  number[0][0]=80;
		  number[1][1]=80;
		  
		  number[0][1]=80;
		  number[1][2]=40;
		
		  
		  
	      System.out.println(" " + number[1][2] );
		
	}

}*/



//###########################################################################################################



/*import java.util.*;

public class TwoDArray{
	public static void main(String args[]) {
		Scanner sss = new Scanner(System.in);
		int row= sss.nextInt();
		int column=sss.nextInt();
		
		int number[][] = new int[row][column];
		
		
		for(int i =0; i<row;i++) {
			for(int j=0; j<column;j++) {
				number[i][j] = sss.nextInt();
			}
		}
		
		
		for(int i = 0; i<row; i++) {
			for(int j =0; j<column; j++) {
				System.out.print(number[i][j] + " ");
				
				}
			System.out.println( );
		}
		
		
	}
}*/




//###########################################################################################################


//Searching for an element x in a matrix



/*import java.util.*;

public class TwoDArray{
	public static void main(String args[]) {
		Scanner sss = new Scanner(System.in);
		int row = sss.nextInt();
		int cols = sss.nextInt();
		
		
		int number[][] = new int[row][cols];
		
	
		// Input 
		
		for(int i =0; i<row; i++) {
			for(int j =0; j<cols; j++) {
				number[i][j] = sss.nextInt();
			}
		
			int x = sss.nextInt();
			
	       for(int i1 =0; i1<row; i1++) {
			 for(int j=0; j<cols; j++) {
				
				if(number[i1][j] == x) {
					System.out.println("number : (" + i1 + ", " + j + ")");
				}
			}
		}
		
		
		
		}
		
	}
}*/





//#########################################################################################################


//For a given matrix of N x M, print its transpose.



import java.util.*;

public class TwoDArray{
	public static void main(String args[]) {
		Scanner sss = new Scanner(System.in);
		int n = sss.nextInt();
		int m = sss.nextInt();
		
		
		int matrix[][] = new int[n][m];
		
	
		// Input 
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				matrix[i][j] = sss.nextInt();
			}
     } System.out.println("tanspose");
     
     for(int i=0; i<n; i++) {
    	 for(int j= 0;j<m;j++) {
    		 System.out.println(matrix[i][j]+" ");
    	 }
    	 System.out.println( );
     }
}
}