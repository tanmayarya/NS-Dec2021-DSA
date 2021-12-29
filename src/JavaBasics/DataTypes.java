package JavaBasics;

public class DataTypes {
	public static void main(String[] args) {
		
		// Part 1
				byte by = 10;
				short sh = 10;
				int in = 10;
				long lo = 10;
				
//				by = sh;
//				by = in;
//				by = ln;
				
				sh = by;
//				sh = in;
//				sh = lo;
				
				in = by;
				in = sh;
//				in = lo;
				
				lo = by;
				lo = sh;
				lo = in;
				
				// Part 2
				by = 10;
				by = 127;
//				by = 128;
				by = (byte)130;
				System.out.println(by);
				
//				// Part 3;
//				in = 1000000000;
////				in = 10000000000;
////				in = 10000000000L;
//				in = (int)10000000000L;
//				
//				// Part 4
////				float fl = 5.5;
//				float fl = 5.5F;
//				double db = 5.5;
//				
////				fl = db;
//				fl = (float)db;
//				db = fl;
//				
//				// Part 5
////				in = fl;
//				in = (int)fl;
//				
//				// Part 6
//				boolean bo = true;
//				bo = false;
//				
//				if(bo){
//					System.out.println("Hi");
//				}
//				else {
//					System.out.println("Bye");
//				}
//				
////				if(in){
////					System.out.println("Bizzarre");
////				}
//				
//				if(in > 0){
//					System.out.println("Ok");
//				}
//				
//				// Part 7
//				char ch = 'a';
//				ch = 97;
//				ch = 64000;
////				ch = 67000;
//				ch = (char)67000;
//				
//				ch = (char)(Math.pow(2, 16) - 1 + 98);
//				System.out.println(ch);
//				
//				in = ch + 23;
////				ch = ch + 1;
//				
//				// Part 8
//				System.out.println(10 + 20 + "Hello" + 10 + 20);
//				System.out.println(2 + ' ' + 5);
//				System.out.println(2 + " " + 5);
//				System.out.println("Hello" + '\t' + "World");
//				System.out.println("Hello" + "\t" + "World");
		
	}
}
