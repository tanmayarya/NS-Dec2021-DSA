package Stack;

import java.util.Stack;

public class Basics {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println(st.isEmpty());
//		System.out.println(st.peek());
//		System.out.println(st.pop());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
	}
}
