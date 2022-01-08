package JavaBasics;

import java.util.Scanner;

public class IntroToArrays {
	
	public static int sumAllElements(int arr[]) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];// sum = sum + arr[i]
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		
		int sum = sumAllElements(arr);
		System.out.println(sum);
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}		
//		for(int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
//		int [] marks;
//		marks = new int[10];
//		
//		marks[9] = 90;
//		marks[1] = 59;
//		marks[3] = 20;
////		marks[-1] = 2; // index out of bound
//		for(int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
//		
//		char arr[] = new char[5];
//		arr[0] = 'a';
//		arr[1] = 'b';
//		arr[2] = 'c';
//		arr[3] = 'd';
//		arr[4] = 'b';
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int arr2[] = {20, 30, -70, 100};
//		
//		System.out.println(arr2.length);
//		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		boolean arr3[] = {true, true, false};
		
	}

}
