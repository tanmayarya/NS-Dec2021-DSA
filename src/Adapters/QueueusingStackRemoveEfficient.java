package Adapters;

import java.util.Stack;

public class QueueusingStackRemoveEfficient {
	Stack<Integer> main;
	Stack<Integer> helper;
	
	QueueusingStackRemoveEfficient() {
		main = new Stack<>();
		helper = new Stack<>();
	}
	
	public void add(int value) {
		// move all elements from main to helper
		while(!main.isEmpty()) {
			helper.push(main.pop());
		}
		
		// add the value to main stack
		main.push(value);
		
		
		// move all the elements back from helper to main
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
	}
	
	public int remove() {
		if(main.isEmpty()) return -1;
		
		return main.pop();
	}
	
	public int peek() {
		if(main.isEmpty()) return -1;
		
		return main.peek();
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int size() {
		return main.size();
	}
	
}
