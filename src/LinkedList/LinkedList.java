package LinkedList;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
		
		Node() {}
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	// Time Complexity: O(1)
	public int getSize() {
		return this.size;
	}

	// Time Complexity: O(1)
	public void addFirst(int data) {
		Node n = new Node(data, null); // 1
		if(this.size == 0) {
			this.tail = n;
		}
		n.next = this.head; // 2
		this.head = n; // 3
		this.size++; // 4
	}
	
	// Time Complexity: O(1)
	public void addLast(int data) {
		if(this.size == 0) {
			addFirst(data);
			return;
		}
		Node n = new Node(data, null);
		this.tail.next = n;
		this.tail = n;
		this.size++;
	}
	
	// Time Complexity: O(n)
	public void add(int data, int idx) {
		if(idx == 0) {
			addFirst(data);
			return;
		}
		if(idx == this.size - 1) {
			addLast(data);
			return;
		}
		
		Node prev = getNode(idx - 1);
		Node n = new Node(data, null);
		n.next = prev.next;
		prev.next = n;
		this.size++;
	}
	
	// Time Complexity: O(n)
	public int get(int idx) {
		Node n = getNode(idx);
		return n.data;
	}
	
	// Time Complexity: O(n)
	public void set(int data, int idx) {
		Node n = getNode(idx);
		n.data = data;
	}
	
	// Time Complexity: O(n)
	private Node getNode(int idx) {
		if(idx >= this.size) return null;
		if(idx == this.size - 1) return this.tail;
		int tempIdx = 0;
		Node temp = this.head;
		while(tempIdx < idx) {
			temp = temp.next;
			tempIdx++;
		}
		return temp;
	}
	
	// Time Complexity: O(1)
	public void removeFirst() {
		if(isEmpty()) return;
		if(this.size == 1) this.tail = null;
		this.head = this.head.next;
		this.size--;
	}
	
	// Time Complexity: O(n)
	public void remove(int idx) {
		if(idx == 0) {
			removeFirst();
			return;
		}
		Node n = getNode(idx - 1);
		n.next = n.next.next;
		if(idx == this.size - 1) this.tail = n;
		this.size--;
	}
	
	// Time Complexity: O(1)
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	// Time Complexity: O(n)
	public void display() {
		Node temp = this.head;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	private void swap(Node one, Node two) {
		int temp = one.data;
		one.data = two.data;
		two.data = temp;
	}
	
	
	private void swapHeadTail() {
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}
	
	// Time Complexity: O(n*n)
	public void reverseDI() {
		int l = 0, r = this.size - 1;
		Node lNode, rNode;
		
		while(l < r) {
			lNode = getNode(l);
			rNode = getNode(r);
			
			//swap
			swap(lNode, rNode);
			l++;
			r--;
		}
	}

	// Time Complexity: O(n)
	public void reversePI() {
		Node p = null, c = this.head, n;
		
		while(c != null) {
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		swapHeadTail();
	}
	
	public void reversePR() {
		reversePR(this.head);
		swapHeadTail();
		this.tail.next = null;
	}
	
	// Time Complexity: O(n)
	private void reversePR(Node n) {
		if(n == tail) return;
		
		reversePR(n.next);
		n.next.next = n;
	}
	
	// created for reverse DR function
	private Node left;
	
	public void reverseDR() {
		left = this.head;
		reverseDR(this.head, 0);
	}
	
	// Time Complexity: O(n)
	private void reverseDR(Node right, int ri) {
		if(right == null) return;
		
		reverseDR(right.next, ri + 1);
		if(ri >= this.size/2) {
			swap(left, right);
			left = left.next;
		}
	}
}
