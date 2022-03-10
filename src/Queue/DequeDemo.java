package Queue;

import java.util.*;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(2);
		dq.addFirst(3);
		dq.addLast(4);
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		dq.removeLast();
		dq.removeFirst();
		System.out.println(dq);
	}
}
