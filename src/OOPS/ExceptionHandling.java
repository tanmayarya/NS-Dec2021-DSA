package OOPS;

public class ExceptionHandling {
	
	public static int divide(int a, int b) {
		
		int result = 0;
		try {
			System.out.println("inside try");
			int arr[] = new int [1];
			Student s = new Student();
			s.name.charAt(0);
			arr[2] = 2;
			result = a/b;
			System.out.println("after exception");
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("inside indexOutOfBound catch block");
		}
		catch (NullPointerException e2) {
			System.out.println("inside NullPointer catch block");
		}
//		 catch (ArithmeticException e) {
//			 System.out.println("inside arithmetic catch block");
//		}
//		catch (Exception e) {
//			
//		}
		return result;
	}
	
	public static void fun(int a, int b) {
		int ans = divide(a, b);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		fun(2,0);
	}
}
