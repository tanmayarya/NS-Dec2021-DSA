package Strings;

import java.util.Scanner;

public class Basics {
	
	
	public static void main(String[] args) {
		
		String s = "Newton School";
		System.out.println(s);
		
//		Scanner scn = new Scanner(System.in);
//		String a = scn.next();
//		String b = scn.nextLine();
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println(s.length());
		
		char ch = s.charAt(10) ;
		System.out.println(ch);
		
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(1,2));
//		System.out.println(s.substring(5,2));
		System.out.println(s.substring(0, 5));
		System.out.println(s.substring(5));
		
		String s2 = s + " Welcome Everyone";
		System.out.println(s2);
		
		System.out.println(10 + 30 + "Hey" + 10 + 30);
		System.out.println("10" + "30" + "Hey" + 10 + 30);
		
//		String strs[] = new String[4];
//		strs[0] = "asadsad";
//		
//		for(int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
		
		String arr[] = s2.split("Welcome");
		
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		char arr2[] = s.toCharArray();
		
		for(int i = 0; i < arr2.length; i++) 
			System.out.print(arr2[i] + " ");
	}
}
