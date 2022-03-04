package Queue;


public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingArray q = new QueueUsingArray(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.display();
		
		System.out.println(q.size());
		
		System.out.println(q.remove());
		q.display();
		q.add(5);
		q.add(6);
		q.display();
//		q.add(7);
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		
		q.remove();
	}

}
