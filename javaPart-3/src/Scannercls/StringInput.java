package Scannercls;

import java.util.Scanner;
public class StringInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("single Word");
		String s =sc.next();
		System.out.println("Single "+s);
		
		System.out.println("multi Word");
		String s1 = sc.nextLine();
		
		System.out.println("multi word "+s1);
				
	}

}
