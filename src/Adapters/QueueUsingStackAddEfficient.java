package Adapters;

import java.util.Stack;

public class QueueUsingStackAddEfficient {
	Stack<Integer> main;
	Stack<Integer> helper;
	
	QueueUsingStackAddEfficient() {
		main = new Stack<>();
		helper = new Stack<>();
	}
	
	public void add(int value) {
		main.push(value);
	}
	
	public int remove() {
		if(main.size() == 0) return -1;
		
		// remove from main stack
		while(main.size() > 1) {
			helper.push(main.pop());
		}
//		remove the first item
		int itemToRemove = main.pop();
		
//		move remaining item to main stack
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		
		return itemToRemove;
	}
	
	public int peek() {
		if(main.size() == 0) return -1;
		
		// remove from main stack
		while(main.size() > 1) {
			helper.push(main.pop());
		}
//		remove the first item
		int itemToReturn = main.peek();
		
//		move remaining item to main stack
		while(!helper.isEmpty()) {
			main.push(helper.pop());
		}
		
		return itemToReturn;
	}
	
	public boolean isEmpty() {
		return main.isEmpty();
	}
	
	public int size() {
		return main.size();
	}
	
}
