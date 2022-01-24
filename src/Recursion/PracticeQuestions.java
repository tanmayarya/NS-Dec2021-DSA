package Recursion;

public class PracticeQuestions {
	
	
	public static int max(int arr[], int idx) {
		
		if(idx == arr.length - 1) return arr[idx];
		
		int maxAhead = max(arr, idx + 1);
		return Math.max(maxAhead, arr[idx]);
	}
	
	
	public static int lastIndex(int arr[], int element, int idx) {
		
		if(idx == arr.length) return -1;
		
		int lastIdx = lastIndex(arr, element, idx + 1);
		
		if(lastIdx == -1) { // check the current element
			if(arr[idx] == element) return idx;
			else return -1;
		}else return lastIdx; // element is present ahead of this position
	}
	
	public static int countMazePath(int arr[][], int row, int col) {
		// positive base case
		if(row == arr.length - 1 && col == arr[0].length - 1) return 1;
		
		// negative base case
		if(row == arr.length || col == arr[0].length) return 0;
		
		int pathsFromRight = countMazePath(arr, row, col + 1);
		int pathsFromBottom = countMazePath(arr, row + 1, col);
		
		return pathsFromBottom + pathsFromRight;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 2, 8, 3, 6, 1, 4, 6, 1};
//		System.out.println(max(arr, 0));
//		System.out.println(lastIndex(arr, 6, 0));
		
		int arr2[][] = new int[4][4];
		System.out.println(countMazePath(arr2, 0, 0));
	}
}
