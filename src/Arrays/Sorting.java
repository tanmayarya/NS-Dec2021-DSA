package Arrays;

import java.util.Arrays;

public class Sorting {
	
	public static void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			//shifting greater elements to 1 pos right
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void selectionSort(int arr[]) {
		for(int pass = 1; pass <= arr.length - 1; pass++) {
			int startIdx  = pass - 1;
			int minIdx = startIdx;
			// find the minIdx
			for(int i = startIdx; i < arr.length; i++) {
				if(arr[i] < arr[minIdx]) {
					minIdx = i;
				}
			}
			swap(arr, minIdx, startIdx);
		}
	}
	
	public static void bubbleSort(int arr[]) {
		for(int pass = 1; pass <= arr.length -1; pass++) {
			boolean isSwapped = false;
			for(int j = 1; j <= arr.length - pass; j++) {
				if(arr[j] < arr[j-1]) {
					// swap
					swap(arr, j, j-1);
					isSwapped = true;
				}
			}
			if(isSwapped == false) break;
			
		}
	}
	
	public static int[] mergeSort(int arr[], int lo, int hi) {
		if(lo == hi) {
			int res[] = new int[1];
			res[0] = arr[lo];
			return res;
		}
		
		int mid = (lo + hi) / 2;
		
		int arr1[] = mergeSort(arr, lo, mid);
		int arr2[] = mergeSort(arr, mid+1, hi);
		
		int res[] = merge(arr1, arr2); 
		return res;
				 
	}
	
	public static int[] merge(int a[], int b[]) {
		int res[] = new int[a.length + b.length];
		
		int i = 0, j = 0, k = 0;
		
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		
		while(j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		
		
		return res;
	}
	
	
	public static int partition(int arr[], int pivot, int lo, int hi) {
		// 0 to j-1 <=3
		// j to i-1 >3
		// i to n-1 unknown
		int i = lo, j = lo;
		while(i <= hi) {
			if(arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		return j - 1;
	}
	
	public static void quickSort(int arr[], int lo, int hi) {
		if(lo >= hi) return;
		
		int pivot = arr[hi];
		int pivotIndex = partition(arr, pivot, lo, hi);
		
		quickSort(arr, lo, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, hi);
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 3,1,2,4};
		int arr2[] = {1,4,6,8,10,12,15};
//		display(arr);
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
		display(arr);
//		display(arr2);
//		display(merge(arr, arr2));;
//		display(mergeSort(arr, 0, arr.length - 1));
//		display(arr);
		
//		System.out.println(partition(arr, 4, 0, arr.length - 1));
//		display(arr);
//		quickSort(arr, 0, arr.length - 1);
		display(arr);
	}
}
