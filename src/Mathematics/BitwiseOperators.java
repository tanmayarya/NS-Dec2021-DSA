package Mathematics;

public class BitwiseOperators {

	public static int turnOnBit(int n, int i) {
		int mask = (1 << (i-1));
		int ans = n | mask;
		return ans;
	}
	
	public static void main(String[] args) {
		int n = 5; // 000101 => 000111
		System.out.println(turnOnBit(n, 2));
	}

}
