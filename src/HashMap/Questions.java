package HashMap;

import java.util.HashMap;

public class Questions {
	
	public static void maxFreqCharacter(String s) {
		
		HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
		
//		filling the fmap
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int prevFreq = fmap.getOrDefault(c, 0);
			fmap.put(c, prevFreq + 1);
		}
		
		int maxFreq = 0;
		char charWithMaxFreq = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int currFreq = fmap.get(c);
			if(currFreq > maxFreq) {
				maxFreq = currFreq;
				charWithMaxFreq = c;
			}
		}
		System.out.println(charWithMaxFreq + " " + maxFreq);
	}
	
	public static void main(String[] args) {
		maxFreqCharacter("newton school");
	}
}
