package LinkedList;

import java.util.HashSet;

public class Questions {
	public static boolean hasCycle(Node node) {
		Node slow = node;
		Node fast = node;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	public static int cycleLength(Node node) {
		Node slow = node;
		Node fast = node;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
//				
				int count = 1;
				slow = slow.next;
				while(fast != slow) {
					count++;
					slow = slow.next;
				}
				return count;
			}
		}
		return -1;
	}
	
	public static int StartingPointOfCycle(Node node) {
		Node slow = node;
		Node fast = node;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
//				
				slow = node;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow.data;
			}
		}
		return -1;
	}
	
	public static Node removeDuplicates(Node head) {
		if(head == null) return head;
		HashSet<Integer> set = new HashSet<>();
		set.add(head.data);
		
		Node temp = head;
		while(temp.next != null) {
			int numberToCheck = temp.next.data;
			if(set.contains(numberToCheck)) { // already present
				temp.next = temp.next.next;
			} else {
				set.add(numberToCheck);
				temp = temp.next;
			} 
		}
		
		return head;
	}
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
//		list.addLast(1);
		list.addLast(4);
		list.addLast(4);
//		list.addLast(5);
//		list.addLast(2);
//		list.addLast(4);
//		list.addLast(5);
//		list.addLast(5);
//		
		list.display();
		Node head = list.getNode(0);
		
		Node node2 = list.getNode(2);
//		create a cycle
//		list.getNode(list.getSize() - 1).next = node2;
//		System.out.println(hasCycle(head));
//		System.out.println(cycleLength(head));
//		System.out.println(StartingPointOfCycle(head));
		
		removeDuplicates(head);
		list.display();
		
	}
}
