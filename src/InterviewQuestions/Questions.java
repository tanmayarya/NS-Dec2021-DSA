package InterviewQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Questions {

	public static void maxOfkSizedWindow(int arr[], int k) {
		int s = 0, e = 0;
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		while(e < arr.length) {
			// work
			while(!dq.isEmpty() && dq.peekLast() < arr[e]) dq.removeLast();
			dq.addLast(arr[e]);
			
			//complete current window
			if(e - s + 1 < k) {
				e++;
			}
			else { // window completed ie => e - s + 1 == k
				// get answer
				System.out.println(dq.peekFirst());
				
				// remove effect of start element
				if(dq.peekFirst() == arr[s]) dq.removeFirst();
				
				// slide window
				s++;
				e++;
			}
			
			
		
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 2, 1, 5 ,3 ,8, 4, 7, 9};
		maxOfkSizedWindow(arr, 4);
	}
}
