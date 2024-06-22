package supercalculatorprog;


import java.util.Scanner;

import com.division.*;
import com.multipication.*;

public class SuperCal {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int rpt ;
		do {
			
			System.out.println("***** Calculator *****");
			System.out.println("Enter a first number");
			int a = sc.nextInt();
			
			System.out.println("Enter a sencond number ");
			int b =sc.nextInt();
			
			System.out.println("Select oparetor\n 1 Addition \n 2 Subtraction \n 3 Subtraction \n 4 Division ");
			
			int choise = sc.nextInt();		
			
			if(choise == 1) {
				
				com.addition.Addition o1=  new com.addition.Addition();
				o1.add(a, b);
			}
			
			else if(choise == 2) {
				com.subtraction.Subtracte o2 = new com.subtraction.Subtracte();
				o2.sub(a,b);
			}
			
			else if(choise == 3) {
				Multipication m = new Multipication();
				m.multi(a, b);
			}
			
			else if(choise == 4) {
				Division d = new Division();
				d.div(a,b);
			}
			
			else {
				System.out.println("invalid character");
			}
			System.out.println();
			System.out.println("Enter 0 Again repeat Calculator");
			
			
			rpt =sc.nextInt();
			}
		
		while(rpt == 0);
		
		
	}

}
