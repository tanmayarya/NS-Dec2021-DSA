package JavaBasics;

public class Loops {

	public static void main(String[] args) {

		int n = 4;
//		
		// print 1 to n
//		for(int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}
		
		// print n to 1
//		for (int i = n; i >= 1; i--) {
//			System.out.println(i);
//		}
		
//		print n to 0 with gap of 2
//		for(int i = n; i > 0; i -= 2) {
//			System.out.println(i);
//		}
		
		int i = 1;
		
//		while (i <= n) {
//			System.out.println(i);
//			i++;
//		}
		
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 0);
//		
//		for(i = 1; i <= 10; i++) {
//			System.out.println( "19 * " + i + " = " + (19 * i));
//		}
		
		// facorial
//		int result = 1;
//		
//		for(i = 1; i <= n; i++) {
//			result = result * i;
//		}
//		
//		System.out.println(result);
		
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println(a);
		System.out.println(b);
		while(c <= n) {
			
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}

}
