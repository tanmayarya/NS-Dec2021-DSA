package OOPS;

public class MyArrayList {
	private int data[];
	int size;
	int CAPACITY = 10;
	
	public MyArrayList() {
		this.data = new int[CAPACITY];
		this.size = 0;
	}
	
	public void add(int value) {
		if(size == CAPACITY) {
			resize();
		}
		
		data[size++] = value;
	}
	
	public int remove() {
		size--;
		int itemToReturn = data[size];
		return itemToReturn;
	}
	
	public void set(int idx, int val) {
		data[idx] = val;
	}
	
	public int get(int idx) {
		return this.data[idx];
	}
	
	private void resize() {
		int temp[] = new int[2 * CAPACITY];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
		CAPACITY *= 2;
	}
	
	@Override
	public String toString() {
		String res = "[";
		for(int i = 0; i < size; i++)
			res += data[i]+ " ";
		res+= "]";
		return res;
	}
	
	
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		list.remove();
		list.remove();
		
		System.out.println(list);
		
		list.set(2, 1000);
		System.out.println(list);
	}
}
