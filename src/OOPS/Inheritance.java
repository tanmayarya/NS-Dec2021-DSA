package OOPS;

class Parent {
	int a;
	int d;
	
	Parent() {
		this.a = 10;
	}
	
	Parent(int a) {
		this.a = a;
	}
	
	void printA() {
		System.out.println(this.a);
	}
}

class Child extends Parent{
	int b;
	int d;
	
	Child() {
		this(20);
	}
	
	Child (int b) {
		this.b = b;
	}
	
	Child(int a, int b) {
		super(a);
		this.b = b;
	}
	
	void printB() {
		System.out.println(this.b);
	}
}

class GrandChild extends Child{
	int c;
	int d;
	GrandChild() {
		
	}
	
	GrandChild(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	void print() {
		System.out.println(c);
		System.out.println(super.d);
		super.printB();
	}
}

public class Inheritance {
	public static void main(String[] args) {
//		Child obj = new Child();
//		obj.printB();
//		obj.printA();
//		System.out.println(obj.a);
		GrandChild o = new GrandChild(1,2,3);
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(o.c);
	}
}
