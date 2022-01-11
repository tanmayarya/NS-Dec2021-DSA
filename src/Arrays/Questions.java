package Arrays;

import java.util.Scanner;

public class Questions {
	
	public static int getMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void OddEvenSum(int arr[]) {
		
		int osum = 0, esum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) { // even case
				esum += arr[i];
			}else {
				osum += arr[i];
			}
		}
		
		System.out.println("odd sum:" + osum + "even sum:" + esum);
	}

	
	public static boolean isElementRepeated(int arr[], int n) {
		
		int nCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				nCount++;
				
				if(nCount > 1) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static int repeatedNumber(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		
		return -1;
	}
	
	public static int[] reverse(int arr[]) {
		
		int l = 0, r = arr.length - 1;
		
		while(l < r) {
			// swap
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			l++;
			r--;
		}
		return arr;
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
		
	}
	
	public static void pairSum(int arr[], int k) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == k) 
					System.out.println(arr[i] + ", " + arr[j]);
			}
		}
	}
	
	public static void tripletSum(int arr[], int target) {
		
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {10, 20, -50, 100, 60, -200, 20};
//		System.out.println(getMax(a));
//		OddEvenSum(a);
//		System.out.println(isElementRepeated(a, 20));
		
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		int arr[] = {10, 20 ,30 ,1, 40, 30, 20, 49};
//		int arr[] = new int [n];
//		
//		for(int i = 0; i < n; i++) 
//			arr[i] = scn.nextInt();
			
		
		
//		System.out.println(repeatedNumber(arr));
		
//		int arr2[] = reverse(arr);
//		display(arr2);
		
//		pairSum(arr, 50);
		int arr2[] = {4, 8, 1, 6, 5, 3, 2};
		tripletSum(arr2, 9);
	}
}
