package JavaBasics;

public class Operators {

	public static void main(String[] args) {
		
		// unary operators
		// increment
		int a = 5;
		int b = ++a;
		int c = a++;
		int d = ++c;
		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		
		
		//decrement
		a = 5;
		b = --a;
		c = a--;
		d = --c;
		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		a = 5;
		b = 2;
		c = 5;
		d = 7;
		
		
		// Relational Operators
		// < , > , <= , >=, ==, !=
//		System.out.println(a > b);
//		System.out.println(a >= b);
//		System.out.println(a < b);
//		System.out.println(a != b);
//		System.out.println(a == c);
		
		// logical operators
		// && AND
		// || OR
//		System.out.println(true && true);
//		System.out.println(false && true);
//		System.out.println(false || true);
//		System.out.println(a > b && c > b && a == c);

		// Assignment Operator
		a = 10;
		a %= 5;
		System.out.println(a);

		// Ternary Operator
		a = 10;
		b = 20;
//		char ch = false ? '/': '*';
//		System.out.println(ch);
		System.out.println( true ? "Hello" : "Hi");
		System.out.println( false ? "Hello" : "Hi");
		System.out.println( a > b ? "Hello" : "Hi");
		System.out.println( a <= b ? "Hello" : "Hi");
	}

}
