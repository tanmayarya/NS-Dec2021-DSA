package OOPS;

class A {
	int a;
	
	void printA() {
		
	}
	
	void print() {
		System.out.println("Print of A class");
	}
}

class B extends A{
	int b;
	
	@Override
	void print() {
		System.out.println("Print of B class");
	}
	
	void printB() {
		System.out.println();
	}
}

public class Polymorphism {
	
	// function overloading
	 public static void sum() {
		System.out.println("this is sum 1"); 
	 }

	 public static int sum(int a, int b) {
		System.out.println("this is sum 2");
		return 0;
	 }

	 public static void sum(int a, int b, int c) {
		System.out.println("this is sum 3"); 
	 }

	 public static void sum(double a, double b) {
		System.out.println("this is sum 4"); 
	 }

	 public static void fun(int a, String s) {
		 
	 }

	 public static void fun(String s, int a) {
		 
	 }

	 public static void main(String[] args) {
//		 sum(1.0, 2.0);
		 
//		 B obj = new B();
//		 obj.print();
//		 
//		 A obj2 = new A();
//		 obj2.print();
		 
		 A obj3 = new B();
		 obj3.print();
		 
		 
//		 B obj4 = new A();
	}
}
