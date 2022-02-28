package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Questions {
	
	public static void maxFreqCharacter(String s) {
		
		HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();
		
//		filling the fmap
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int prevFreq = fmap.getOrDefault(c, 0);
			fmap.put(c, prevFreq + 1);
		}
		
		int maxFreq = 0;
		char charWithMaxFreq = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int currFreq = fmap.get(c);
			if(currFreq > maxFreq) {
				maxFreq = currFreq;
				charWithMaxFreq = c;
			}
		}
		System.out.println(charWithMaxFreq + " " + maxFreq);
	}
	
	public static void commonElements1(int arr1[], int arr2[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int elem : arr1) set.add(elem);
		
		for(int element : arr2) {
			if(set.contains(element)) {
				System.out.println(element);
				set.remove(element);
			}
		}
	}
	
	public static void commonElements2(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// creates freq
		for(int elem : arr1) {
			int currentFreq = map.getOrDefault(elem, 0);
			map.put(elem, currentFreq + 1);
		}
		
		for(int elem : arr2) {
			if(map.containsKey(elem)) {
				System.out.println(elem);
				int currFreq = map.get(elem);
				if(currFreq == 1) {
					map.remove(elem);
				} else {
					map.put(elem, currFreq - 1);
				}
			}
		}
		
	}
	
	public static void uncommonElements(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int elem : arr1) {
			map.put(elem, 1); // only in first array
		}
		
		for(int elem : arr2) {
			if(map.containsKey(elem) && map.get(elem) != 2) {
				map.put(elem, 3); // common element
			}else map.put(elem, 2); // only in arr2
		}
		
		map.forEach((k, v) -> {
			if(v != 3) System.out.println(k);
		});
	}
	
	
	public static void main(String[] args) {
//		maxFreqCharacter("newton school");
		
		int arr1[] = {1, 5, 2, 9, 3, 2, 5, 1, 1};
		int arr2[] = {1, 6, 3, 10, 3, 1, 3, 2};
		
//		commonElements1(arr1, arr2);
//		commonElements2(arr1, arr2);
		uncommonElements(arr1, arr2);		
	}
}
