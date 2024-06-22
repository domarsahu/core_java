package apnaclg;
import java.util.*;

/* # Get:-
  
     Get the 3rd bit( posotion = 2) of a number n. (n = 0101)
     
     BitMask:  1<<i
     opration:  AND
     */


/*
public class Bitmanu {
	public static void main(String args[]) {
		int n = 5;          //0101
		int pos = 2;
		int bitMask = 1<<pos;
		
		if((bitMask & n) == 0) {
			System.out.println("bit was  Zero");
		}else {
			System.out.println("bit was one");
		}
	}                  
}*/                       /* Output:-
                                bit was  one  */

	

//#############################################################################################################


/* # Set:-

          Set the 2nd bit( posotion = 1) of a number n. (n = 0101)

          BitMask:  1<<i
          opration:  OR
*/


/*
public class Bitmanu {
public static void main(String args[]) {
	int n = 5;          //0101
	int pos = 1;
	int bitMask = 1<<pos;
	
	int newNumber = bitMask | n ;
	
	System.out.println(newNumber);
	}
}*/                            //Output:   7





//#########################################################################################################


/* # Clear:-

             Clear the 3rd bit( posotion = 2) of a number n. (n = 0101)

             BitMask:  1<<i
             opration:  AND with OR
*/


/*
      public class Bitmanu {
          public static void main(String args[]) {
              int n = 5;          //0101
              int pos = 2;
              int bitMask = 1<<pos;
              
              int notbitMask = ~(bitMask);
              int newNumber = notbitMask & n;

              System.out.println(newNumber);
           } 
        }*/                           //Output:   1






//############################################################################################################



/* # Update:-

     Update the 2nd bit( posotion = 1) of a number n. (n = 0101)
      
       For   0                                            For    1
     BitMask:  1<<i                                  BitMask :  1<<i   
     opration:  AND with OR                          Opration:   OR     
*/




      public class Bitmanu {
           public static void main(String args[]) {
        	   Scanner ss = new Scanner(System.in);
        	   int o = ss.nextInt();
        	   
               int n = 5;          //0101
               int pos = 2;
               int bitMask = 1<<pos;

               if( o == 1)  {
            	   int newNumber = bitMask | n;
            	   System.out.println(" newNumber");
              
               }else {
            	   int notNumber = ~(bitMask);
            	   int newNumber = notNumber & n;
            	   System.out.println(newNumber);
            	   
               }
            }
         }                      //Output:   