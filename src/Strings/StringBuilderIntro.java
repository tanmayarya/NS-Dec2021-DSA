package Strings;

public class StringBuilderIntro {
	
	public static String asciiDifference(String str) {
		
		StringBuilder res = new StringBuilder();
		res.append(str.charAt(0));
		for(int i = 1; i < str.length(); i++) {
			int dif = str.charAt(i) - str.charAt(i-1);
			res.append(dif);
			res.append(str.charAt(i));
		}
		return res.toString();
	} 

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Newton School");
		System.out.println(sb);
		
		// get a character
		char c = sb.charAt(2);
		System.out.println(c);
		
		//add at the end
		sb.append('d');
		System.out.println(sb);
		
		// add at an index
		sb.insert(2, 'e');
		System.out.println(sb);
		
		//updates a character
		sb.setCharAt(2, 'w');
		System.out.println(sb);
		
		// remove at an index
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		// deletes a substring
		sb.delete(2, 6);
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.substring(3, 5));
		
		String str = sb.toString();
		
		
		// performance check
//		int n = 1000000;
//		long startTime = System.currentTimeMillis();
//		StringBuilder s = new StringBuilder();
//		for(int i = 0; i < n; i++) {
//			s.append(i);
//		}
//		long endTime = System.currentTimeMillis();
//		long duration = endTime - startTime;
//		System.out.println(duration);
		
		
		System.out.println(asciiDifference("aswdjw"));
		
	}

}
