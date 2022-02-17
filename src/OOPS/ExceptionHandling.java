package OOPS;

public class ExceptionHandling {
	
	public static int divide(int a, int b) throws Exception {
		
		if(b == 0) {
			throw new Exception("divide by 0 is not allowed");
		}
		
		int result = 0;
		try {
			
			System.out.println("inside try");
			int arr[] = new int [1];
			Student s = new Student();
			s.name.charAt(0);
			arr[2] = 2;
			result = a/b;
			System.out.println("after exception");
			
		} 
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("inside indexOutOfBound catch block");
//		}
//		catch (NullPointerException e) {
//			System.out.println("inside NullPointer catch block");
//		}
//		 catch (ArithmeticException ex) {
//			 System.out.println("inside arithmetic catch block");
//		}
		catch (Exception e) {
			System.out.println("inside Exception catch block");
		}
		finally {
			System.out.println("in the finally block");
		}
		return result;
	}
	
	public static void fun(int a, int b) throws Exception{
		int ans = divide(a, b);
		System.out.println(ans);
	}
	
	public static void main(String[] args) throws Exception {
//		try {
//			fun(2,0);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		fun(2,0);
	}
}
