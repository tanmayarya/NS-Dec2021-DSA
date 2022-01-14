package Strings;

public class PracticeQuestions {
	
	public static void printAllSubstrings(String str) {
		
		for(int startIdx = 0; startIdx < str.length(); startIdx++) {
			for(int endIdx = startIdx + 1; endIdx <= str.length(); endIdx++) {
				System.out.println(str.substring(startIdx, endIdx));
			}
		}
	}
	
	public static boolean isPalindrome(String str) {
	
		int left = 0, right = str.length() - 1;
		
		while(left < right) {
			char leftChar = str.charAt(left);
			char rightChar = str.charAt(right);
			
			if(!(leftChar + "").equalsIgnoreCase(rightChar + "")) return false;
			
			left++;
			right--;
		}
		return true;
	}
	
	public static void printAllPalindromicSubstrings(String str) {
		
		for(int startIdx = 0; startIdx < str.length(); startIdx++) {
			for(int endIdx = startIdx + 1; endIdx <= str.length(); endIdx++) {
				String subString = str.substring(startIdx, endIdx);
				
				if(isPalindrome(subString) == true) {
					System.out.println(subString);
				}
			}
		}
		
	}
	
	public static String changeToUpperCase(String str) {
		
		String res = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 97) {
				char upperCase = (char)(ch - 'a' + 'A');
				res += upperCase;
			}
			else {
				res += ch;
			}
		}
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
//		printAllSubstrings("Hey");
//		System.out.println(isPalindrome("namaN"));
//		printAllPalindromicSubstrings("Naman");
		System.out.println(changeToUpperCase("Hello"));
	}
}
