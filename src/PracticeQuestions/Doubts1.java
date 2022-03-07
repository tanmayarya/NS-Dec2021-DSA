package PracticeQuestions;

public class Doubts1 {
	
	public static int containsPatternChar(String s) {
		if(s.length() < 26) return -1;
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < s.length() - 25; i++) {
			if(s.charAt(i) == 'a') {
				int charToSearch = 'b';
				for(int j = i+1; j < s.length() - (25 - charToSearch + 'a'); j++) {
					if(s.charAt(j) == charToSearch) {
						if(charToSearch == 'z') {
							ans = Math.min(ans, j - i + 1);
							break;
						}
						charToSearch = (char)(charToSearch + 1);
					}
				}
			}
		}
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}
	
	public static void main(String[] args) {
		System.out.println(containsPatternChar("aaaabcdefghijklmnopqrstuvwxyabcdzzz"));
	}
}
