package Stack;

import java.util.Stack;

public class Questions {

	public static boolean duplicateBrackets(String s) {
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == ')') {
				if(st.peek() == '(') return true;
				 else {
					while(st.peek() != '(') 
						st.pop(); // removes every char except for opening bracket
					
					st.pop(); // remove opening bracket
				}
			} else st.push(c);
			
		}
		return false;
	}
	
	public static boolean balancedBrackets(String s) {
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[') st.push(c);
			
			else if(c == ')') {
				boolean ans = checkComplimentry(st, '(');
				if(ans == false) return false;
			}
			else if(c == ']') {
				boolean ans = checkComplimentry(st, '[');
				if(ans == false) return false;
			}
			else if(c == '}') {
				boolean ans = checkComplimentry(st, '{');
				if(ans == false) return false;
			}
		}
		return st.isEmpty();
	}
	
	public static boolean checkComplimentry(Stack<Character> st, char compBracket) {
		if(st.isEmpty() || st.peek() != compBracket) return false;
		st.pop();
		return true;
				
	}
	
	public static int[] nextGreaterElementOnRight(int arr[]) {
		int res[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				int popedIdx = st.pop();
				res[popedIdx] = arr[i];
			}
			
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			int popedIdx = st.pop();
			res[popedIdx] = -1;
		} 
		
		return res;
	}
	
	public static void main(String[] args) {
//		System.out.println(duplicateBrackets("(((a+b)) + c + (d+f))"));
//		System.out.println(balancedBrackets("{[()]()]"));
		int arr[] = {3, 5, 11, 7, 6, 5, 1, 4, 8};
		int res[] = nextGreaterElementOnRight(arr);
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i] + " -> " + res[i]);
		
	}

}
