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
		
	}
}
