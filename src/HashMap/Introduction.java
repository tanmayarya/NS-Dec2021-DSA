package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Introduction {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
	// add in hashmap
		map.put("Tanmay", 80);
		map.put("Alam", 90);
		map.put("Shubham", 100);
		map.put("Kunal", 80);
		map.put("Abdul", 95);
		
		System.out.println(map);
		
		// update call
		map.put("Tanmay", 90);
		map.put("Aditya", 85);
		System.out.println(map);
		
		// get element
		System.out.println(map.get("Shubham"));
		System.out.println(map.get("Tanmay"));
		System.out.println(map.get("Newton School"));
		
		System.out.println(map.getOrDefault("Kunal", 100));
		System.out.println(map.getOrDefault("Newton School", 100));
		
		// check key
		System.out.println(map.containsKey("Abdul"));
		System.out.println(map.containsKey("Newton"));
		
		// size of hashmap
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		// remove
		System.out.println(map.remove("Tanmay"));
		System.out.println(map);
		
//		String arr[] = {"Newton", "School", "Shubham", "Aditya"};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(String str : arr) {
//			System.out.println(str);
//		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
//		for(String key : map.keySet()) {
//			System.out.println(key + " with marks " + map.get(key));
//		}
		
		map.forEach((k, v) -> {
			System.out.println(k + v);
		});
		
		HashSet<Integer> set = new HashSet<>();
		
		// add element
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(1);
		set.add(5);
		
		System.out.println(set);
		
		// check element
		System.out.println(set.contains(6));
		
		// remove
		set.remove(5);
		
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		for(Integer element : set) {
			System.out.println(element);
		}
		
		set.forEach((el) -> {
			System.out.println(el + " in for each ");
		});
	}
}
