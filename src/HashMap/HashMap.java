package HashMap;

import java.util.HashSet;
import java.util.LinkedList;

public class HashMap <K, V> {
	private class HMNode {
		K key;
		V value;
		
		public HMNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	LinkedList<HMNode> buckets[];
	int size;
	int lambda;
	
	public HashMap() {
		initaliseBuckets(4);
		lambda = 2;
	}

	private void initaliseBuckets(int arraySize) {
		buckets = new LinkedList[arraySize];
		for(int i = 0; i < buckets.length; i++) 
			buckets[i] = new LinkedList<>();
		this.size = 0;
	}
	
	public void put(K key, V value) {
		int bi = hashfunction(key);
		int elemIdx = getIndexInBucket(bi, key);
		
		if(elemIdx == -1) {
//			add
			HMNode node = new HMNode(key, value);
			buckets[bi].add(node);
			this.size++;
		} else {
//			update
			HMNode nodeToUpdate = buckets[bi].get(elemIdx);
			nodeToUpdate.value = value;
		}
	
		
		double currentLambda = size * 1.0 / buckets.length;
		if(currentLambda > this.lambda) {
			rehash();
		}
	}
	
	public V get(K key) {
		int bi = hashfunction(key);
		int elemIdx = getIndexInBucket(bi, key);
		
		if(elemIdx == -1) {
			return null;
		} else {
			return buckets[bi].get(elemIdx).value;
		}
	}
	
	public V remove(K key) {
		int bi = hashfunction(key);
		int elemIdx = getIndexInBucket(bi, key);
		
		if(elemIdx == -1) {
			return null;
		} else {
			return buckets[bi].remove(elemIdx).value;
		}
	}
	
	public boolean containsKey(K key) {
		int bi = hashfunction(key);
		int elemIdx = getIndexInBucket(bi, key);
		
		if(elemIdx == -1) {
			return false;
		} else {
			return true;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public HashSet<K> keySet() {
		HashSet<K> keys = new HashSet<>();
		for(LinkedList<HMNode> bucket : buckets) {
			for(HMNode node : bucket) {
				keys.add(node.key);
			}
		}
		return keys;
	}
	
	private int hashfunction(K key) {
		int hashcode = Math.abs(key.hashCode());
		return hashcode % buckets.length;
		
	}
	
	private int getIndexInBucket(int bi, K key) {
		// linear search in linkedList
		LinkedList<HMNode> llToSearch = buckets[bi];
		int idx = 0;
		for(HMNode node : llToSearch) {
			if(node.key.equals(key)) {
				return idx;
			}
			idx++;
		}
		return -1;
	}
	
	private void rehash() {
		LinkedList<HMNode> currBuckets[] = buckets;
		initaliseBuckets(buckets.length * 2);
		
		for(LinkedList<HMNode> bucket: currBuckets) {
			for(HMNode node : bucket) {
				put(node.key, node.value);
			}
		}
	}
	
}
