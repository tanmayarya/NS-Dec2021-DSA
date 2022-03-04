package Queue;
import java.util.*;

public class Basics {
	
	public static void main(String[] args) {
//		Queue<Integer> q = new Queue<>();
		
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new ArrayDeque<>();
		
		q1.add(2);
		q1.add(3);
		q1.add(1);
		q1.add(4);
		System.out.println(q1);
		System.out.println(q1.peek());
	}
}
