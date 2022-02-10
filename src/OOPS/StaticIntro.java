package OOPS;

import JavaBasics.Functions;


class Human {
	String name;
	static int count;
	
	static {
		System.out.println("inside a static block");
		count = 0;
	}
	
	public Human() {
//		this.name = "Human Name";
		count++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void fun() {
		this.getName();
		this.name = "";
		getCount();
	}
	
	public static int getCount() {
		return count;
	}
}

public class StaticIntro {
	
	class InnerClass {
		
	}
	
	public static void main(String[] args) {
		System.out.println("inside main function");
		Human h1 = new Human();
		Human h2 = new Human();
//		h1.count = 20;
//		System.out.println(h1.count);
//		System.out.println(h2.count);
		
		System.out.println(Human.count);
		new Human();
		new Human();
		new Human();
		System.out.println(Human.count);
		
		StaticIntro o = new StaticIntro();
		InnerClass obj = o.new InnerClass();
		System.out.println(Functions.factorial(4));
		
	}
}
