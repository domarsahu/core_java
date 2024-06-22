package apnaclg;

public class Pattern {
	public static void main(String args[]) {
	
		
		                  //Solid Rectangle
		
		/*for(int i=1; i<=3; i++) {
			for(int j=1; j<=5 ; j++) {           //output:  *****
			  System.out.print('*');                   //   *****
	          }System.out.println();                    //  *****
	   }*/
		
		
		
		
		
	                       	//Hollow Rectangle
		
/*		for(int i=1; i<=4 ;i++) {
			for(int j=1; j<=5 ;j++) {
				if(i==1 || j==1 || i==4 || j==5) {            //output:   *****
						System.out.print("*");                //  *   *
				}else {                                               //  *   *
					System.out.print(" ");                        //  ***** 
				}
			}
				System.out.println();
		}
	*/
		
		
		
		
		
		                        //Half Pyramid
		
	/*	for(int i=1; i<=4; i++) {
			for(int j=1; j<=i ; j++) {                   //output:   *
				System.out.print("*");                     //    **
			}                                              //        ***
			System.out.println();                          //        ****
		}
		*/
		
		
		
		
		
		
/*
		for(int i=1; i<=4 ; i++) {
			for(int j=4 ;j>=i ; j--) {           //output   *****
				System.out.print("*");               // ****
				}                                   //  *** 
				                                     // **
			System.out.println();                    //     *
		}
		*/
		
		
		
		
		
	/*	  
		for(int i=4; i>=1; i--) {
			for(int j=1; j<i ; j++) {                  //output:       *
				System.out.print(" ");                       //   **
			}                                               //       ***
			for(int k=0 ; k<=4-i; k++) {                     //     ****
			System.out.print("*");
		}
          System.out.println();
		}
		*/
		
		
		
		
		/*
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {            //Output:   1
				System.out.print(j);              //         12
			}                                        //      123
			System.out.println();                     //     1234
		}
		*/
		
		
		
		
		
		
		/*for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {           //Output:    1234
				System.out.print(j);              //         123
			}                                     //         12
			System.out.println( );                //         1
		}
		*/
		
		
		
		
		
		/* int number = 1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {                    //Output:     1
			 	System.out.print(number+" ");             //           2 3
				number++;                                  //          4 5 6
	       }                                                    //     7 8 9 10
			System.out.println();
		}
		*/
		
		
		
		
		
		
	  /*    for(int i=1; i<=4; i++) {
	    	  for(int j=1; j<=i; j++) {                      // Output:   1 
	    		  if((i+j) % 2 ==0) {                         //      0 1
	    			  System.out.print(1+" ");                //  1 0 1
	    		  }else {                                    //       0 1 0 1
	    			  System.out.print(0+" ");
	    		  }
	    	  }System.out.println();
	      }
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
