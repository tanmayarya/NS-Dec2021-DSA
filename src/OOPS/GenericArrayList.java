package OOPS;

public class GenericArrayList <T> {
	private Object data[];
	int size;
	int CAPACITY = 10;
	
	public GenericArrayList() {
		this.data = new Object[CAPACITY];
		this.size = 0;
	}
	
	public void add(T value) {
		if(size == CAPACITY) {
			resize();
		}
		
		data[size++] = value;
	}
	
	public T remove() {
		size--;
		return (T) data[size];
	}
	
	public void set(int idx, T val) {
		data[idx] = val;
	}
	
	public T get(int idx) {
		return (T) this.data[idx];
	}
	
	private void resize() {
		Object temp[] = new Object[2 * CAPACITY];
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
}
