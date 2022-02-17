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
	
	public int getSize() {
		return this.size;
	}
	
	public void addFirst(int data) {
		Node n = new Node(data, null); // 1
		if(this.size == 0) {
			this.tail = n;
		}
		n.next = this.head; // 2
		this.head = n; // 3
		this.size++; // 4
	}
	
	public void display() {
		Node temp = this.head;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
}
