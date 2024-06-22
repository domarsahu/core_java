package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_occurance {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string you want to know the occurance");
		String scString=scanner.next();
		
		characterOccurance(scString);
		
	}
	
	
	
	static void characterOccurance(String ss) {
		HashMap<Character, Integer> charOccuranceMap=new HashMap<Character,Integer>();
		char[] stringArray=ss.toCharArray();
		for(char c:stringArray) {
			if(charOccuranceMap.containsKey(c)) {
				charOccuranceMap.put(c, charOccuranceMap.get(c)+1);
			}
			else {
				charOccuranceMap.put(c, 1);
			}
		}
		
		for(Map.Entry entry:charOccuranceMap.entrySet()) {
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
	}
}
