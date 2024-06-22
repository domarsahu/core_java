package com.method;
import java.util.Scanner;

public class EvenOrOdd {
	public static void m1(int n) {
		System.out.println(n);
		if (n%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.err.println("enter a number");
		int m = sc.nextInt();
		
		m1(m);
	}

}
