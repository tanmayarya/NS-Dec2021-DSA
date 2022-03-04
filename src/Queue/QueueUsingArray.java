package Queue;

public class QueueUsingArray {

	int data[];
	int size;
	int front;
	int rear;
	
	public QueueUsingArray(int capacity) {
		this.data = new int[capacity];
		this.size = 0;
		this.front = this.rear = -1;
	}
	
	public void add(int val) {
		if(size == data.length) { // check for full 
			System.out.println("Queue overflow");
			return;
		}
		if(front == -1) front++;
		rear++;
		rear %= data.length;
		data[rear] = val;
		size++;
	} 
	
	public int remove() {
		if(front == -1) { // queue is already empty
			System.out.println("Queue underflow");
			return -1;
		}
		int valToRemove = data[front];
		if(front == rear) { // only 1 element is there
			front = -1;
			rear = -1;
			size = 0;
			return valToRemove;
		}
		front++;
		front %= data.length;
		size--;
		return valToRemove;
	}
	
	public int peek() {
		if(front == -1) { // queue is already empty
			System.out.println("Queue underflow");
			return -1;
		}
		return data[front];
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void display() {
		for(int i = 0; i < size; i++) {
			System.out.print(data[(front + i) % data.length] + ", ");
		}
		System.out.println();
	}
}
