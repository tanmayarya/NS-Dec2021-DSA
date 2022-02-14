package Recursion;

public class Basics {
	
	public static void printDecreasing(int n) {
		if(n == 0) 
			return;
		
		System.out.println(n);
		printDecreasing(n-1);
	}
	
	public static void printDI(int n) {
		
		if(n == 0) return;
		
		System.out.println(n);
		printDI(n-1);
		System.out.println(n);
	}
	
	 static int fact(int n) {
		if(n == 0) return 1;
		
		int res = n * fact(n-1);
		return res;
	}
	
	public static int power(int a, int b) {
		if(b == 0) return 1;
		
		return a * power(a, b-1);
	}
	
	public static int powerAdvance(int a, int b) {
		
		if(b == 0) return 1;
		
		int powerab2 = powerAdvance(a, b/2);
		
		int res;
		if(b % 2 == 0) { // even power
			res = powerab2 * powerab2;
		} else {
			res = powerab2 * powerab2 * a;
		}
		return res;
	}
	
	public static int fib(int n) {
		
//		if(n == 0) return 0;
//		if(n == 1) return 1;
		if(n == 0 || n == 1) return n;
		
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		
		return fnm1 + fnm2;
	}
	
	public static void printReverse(int arr[], int idx) {
		
		if(idx == arr.length) return;
		
		printReverse(arr, idx + 1);
		System.out.println(arr[idx]);
		
	}
	
	public static void main(String[] args) {
		
		int n = 6;
//		printDecreasing(10);
		
//		printDI(n);
//		System.out.println(fact(n));
//		System.out.println(powerAdvance(4,3));
//		System.out.println(fib(9));
		
//		int a[] = {1,2,3,4,5,6};
//		printReverse(a, 0);
		System.out.println(fact(5));
	}
}
