package Mathematics;
import java.util.*;

public class Basics {
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	
	public static int gcdIterative(int a, int b) {
		while(b > 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		return a;
	}
	
	public static boolean[] seiveOfE(int n) {
		boolean seive[] = new boolean[n+1];
		Arrays.fill(seive, true);
		
		for(int i = 2; i * i <= n; i++) {
			if(seive[i] == true) {
				// turning all the factors of i to false
				for(int j = i*2; j <= n; j+=i) {
					seive[j] = false;
				}
			}
		}
		return seive;
	}
	
	public static void main(String[] args) {
		System.out.println(gcdIterative(24,60));
		
		boolean seive[]= seiveOfE(30);
		
		for(int i = 0; i < seive.length; i++) {
			System.out.println(i + " -> " + seive[i]);
		}
	}
}
