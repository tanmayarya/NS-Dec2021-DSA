package JavaBasics;

import java.util.Scanner;

public class Functions {
	
	public static void fun1() {
		System.out.println("inside fun1");
		fun2();
	}
	public static void fun2() {
		System.out.println("inside fun2");
		fun3();
	}
	public static void fun3() {
		System.out.println("inside fun3");
	}
	
	// function definition
	public static int factorial(int n) {
		int nfact = 1;
		
		for(int i = 1; i <= n; i++) {
			nfact *= i; // *= unary operator 
		}
		
		return nfact;
	}
	
	public static int calculateNCR(int n, int r) {
		
		int nfact = factorial(n);
		int rfact = factorial(r);
		int nmrfact = factorial(n-r);
		
		int ncr = nfact / (rfact * nmrfact);
		return ncr;
	}

	public static void main(String[] args) {
		
//		int a = 6;
//		int fact = factorial(a); // function call
//		System.out.println(fact);
		
//		System.out.println(factorial(5));
//		System.out.println(factorial(2));
//		System.out.println(factorial(3));
//		System.out.println(factorial(4));

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		System.out.println(calculateNCR(n, r));
		 
	}

}
