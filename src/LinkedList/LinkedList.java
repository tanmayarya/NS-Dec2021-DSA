package LinkedList;

class Node {
	int data;
	Node next;
	
	Node() {}
	
	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class LinkedList {
	
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
	
	public void addLast(Node node) {
		if(this.isEmpty()) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}
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
	Node getNode(int idx) {
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
	public Node removeFirst() {
		if(isEmpty()) return null;
		if(this.size == 1) this.tail = null;
		Node nodeToBeRemoved = this.head;
		this.head = this.head.next;
		this.size--;
		return nodeToBeRemoved;
	}
	
	// Time Complexity: O(n)
	public Node remove(int idx) {
		if(idx == 0) {
			return removeFirst();
			
		}
		Node n = getNode(idx - 1);
		Node nodeToBeRemoved = n.next;
		n.next = n.next.next;
		if(idx == this.size - 1) this.tail = n;
		this.size--;
		return nodeToBeRemoved;
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

	public int getMid() {
		Node slow = this.head, fast = this.head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	
	public void removeDuplicatesInSortedList() {
		Node temp = this.head;
		
		while(temp != null && temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
				this.size--;
			} else {
				temp = temp.next;
			}
		}
	}
	
	public static LinkedList merge2SortedLL(LinkedList one, LinkedList two) {
		LinkedList res = new LinkedList();
		
		Node o = one.head, t = two.head;
		
		// case for first element
		if(o.data < t.data) {
			res.tail = o;
			res.head = o;
			res.size = 1;
			o = o.next;
		}
		else {
			res.tail = t;
			res.head = t;
			res.size = 1;
			t = t.next;
		}
		
		while(o != null && t != null) {
			if(o.data < t.data) {
				res.tail.next = o;
				res.tail = o;
				res.size++;
				o = o.next;
			} else {
				res.tail.next = t;
				res.tail = t;
				res.size++;
				t = t.next;
			}
		}
		
		// handle the remaining elements of 1 list
		if(o == null) {
			res.tail.next = t;
			while(t != null) {
				res.tail = t;
				res.size++;
				t = t.next;
			}
		} else {
			res.tail.next = o;
			while(o != null) {
				res.tail = o;
				res.size++;
				o = o.next;
			}
		}
		
		
		return res;
	} 
	
	public void oddEven() {
		LinkedList odd = new LinkedList();
		LinkedList even = new LinkedList();
		
		while(this.isEmpty() != true) {
			Node node = this.removeFirst();
			if(node.data % 2 == 0) { // add in even list
				even.addLast(node);
			} else { // add in oddList
				odd.addLast(node);
			}
		}
		
		odd.tail.next = even.head;
		this.head = odd.head;
		this.tail = even.tail;
		this.size = odd.size + even.size;
	}
	
	
	public boolean isPalindrome() {
		left = this.head;
		return isPalindrome(this.head, 0); 
	}
	
	private boolean isPalindrome(Node right, int ri) {
		if(right == null) return true;
		
		boolean outerResult = isPalindrome(right.next, ri + 1);
		if(ri < this.size / 2) return outerResult;
		if(outerResult == true && left.data == right.data) {
			left = left.next;
			return true;
		}
		return false;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
