package LinkedList;

public class Utility {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		
		
		ll.addLast(60);
		ll.display();
		ll.add(90, 2);
		ll.display();
		System.out.println(ll.get(2));
		ll.set(100, 1);
		ll.display();
		ll.remove(2);
		ll.display();
		ll.remove(5);
		ll.display();
		ll.reverseDI();
		ll.display();
		ll.reversePI();
		ll.display();
		ll.reversePR();
		ll.display();
		ll.reverseDR();
		ll.display();
		ll.addLast(60);
//		ll.addLast(70);
		ll.display();
		System.out.println(ll.getMid());
		
		LinkedList ll2 = new LinkedList();
		ll2.addLast(1);
		ll2.addLast(2);
		ll2.addLast(5);
//		ll2.display();
//		ll2.removeDuplicatesInSortedList();
		ll2.display();
		
		LinkedList ll3 = new LinkedList();
		ll3.addLast(0);
		ll3.addLast(3);
		ll3.addLast(3);
		ll3.addLast(4);
		ll3.addLast(6);
		ll3.display();
		LinkedList.merge2SortedLL(ll2, ll3).display();
		
	}
}
