package Mathematics;

public class BitwiseOperators {

	public static int turnOnBit(int n, int i) {
		int mask = (1 << (i-1));
		int ans = n | mask;
		return ans;
	}
	
	public static int turnOffBit(int n, int i) {
		int mask = (~(1 << (i - 1)));
		int ans = n & mask;
		return ans;
	}
	
	public static int toogleBit(int n, int i) {
		int mask = (1 << (i-1));
		int ans = n ^ mask;
		return ans;
	}
	
	public static boolean checkBit(int n, int i) {
		int mask = (1 << (i-1));
		return (n & mask) > 0;
	}
	
	public static boolean isEven(int n) {
		return (n & 1) == 0;
	}
	
	public static int findMissingNumber(int arr[]) {
		int result = 0;
		
		// xor all the elements of the array
		for(int i = 0; i < arr.length; i++) 
			result = (result ^ arr[i]);
		
		// xor from 1 to length + 1
		for(int i = 1; i <= arr.length + 1; i++)
			result = (result ^ i);
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
//		int n = 10; 
//		System.out.println(turnOnBit(n, 2));// ..0101 => ..0111
//		System.out.println(turnOffBit(n, 2)); // 10(1010) => 8(1000)
//		System.out.println(toogleBit(n, 3)); // 10(1010) => 1110
//		System.out.println(checkBit(n, 3));
		int arr[] = {1,2,3,4,5,7,8,9};
		System.out.println(findMissingNumber(arr));
//		System.out.println(isEven(5));
	}

}
