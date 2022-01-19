package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

	public static void main(String[] args) {
		

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al);
		// add element into arrayList
		al.add(10);
		al.add(0, 30);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		
		// remove from al
		al.remove(0);
		System.out.println(al);
		
		// get an element
		int a = al.get(4);
		System.out.println(a);
		
		// update an element
		al.set(2, 80);
		System.out.println(al);
		
		// return the size of Arraylist
		System.out.println(al.size());
		
		// delete all the elements
//		al.clear();
		System.out.println(al);
		
		String as = al.toString(); 
		System.out.println(as);
		
//		for(int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		Integer b = 10;
//		int c = b;
		
		for(int el : al) {
			System.out.println(el);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100000);
		System.out.println(list2);
		
		//append another arraylist
		list2.addAll(al);
		System.out.println(list2);
		
	}

}
