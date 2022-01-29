package Recursion;

import java.util.*;

public class PracticeQuestions2 {
	
	public static ArrayList<String> subSequence(String s) {
		
		if(s.length() == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		char c = s.charAt(0);
		String rem = s.substring(1);
		
		ArrayList<String> recResults = subSequence(rem);
		ArrayList<String> myResults = new ArrayList<>();
		
		for(String ss : recResults) {
			myResults.add("" + ss);
		}
		
		for(String ss : recResults) {
			myResults.add(c + ss);
		}
		
		return myResults;
		
	}

	public static ArrayList<String> getStairPaths(int n) {
		// positive base case
		if(n == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		
		// negative baseCase
		if(n < 0){
			return new ArrayList<String>();
		}
		
		ArrayList<String> pathsnm1 = getStairPaths(n - 1);
		ArrayList<String> pathsnm2 = getStairPaths(n - 2);
		ArrayList<String> pathsnm3 = getStairPaths(n - 3);
		
		ArrayList<String> myResults = new ArrayList<String>();
		
		for(String path: pathsnm1) 
			myResults.add(1 + path);
		
		for(String path: pathsnm2) 
			myResults.add(2 + path);
		
		for(String path: pathsnm3) 
			myResults.add(3 + path);
		
		return myResults;
	}
	
	public static void printStairPaths(int n, String psf) {
		if(n == 0) {
			System.out.println(psf);
			return;
		}
		if(n < 0) return;
		printStairPaths(n - 1, psf + 1);
		printStairPaths(n - 2, psf + 2);
		printStairPaths(n - 3, psf + 3);
	}
	
	public static int countStairPaths(int n) {
		
		if(n == 0) return 1;
		if(n < 0) return 0;
		
		int pathnm1 = countStairPaths(n -1);
		int pathnm2 = countStairPaths(n -2);
		int pathnm3 = countStairPaths(n -3);
		
		return pathnm1 + pathnm2 + pathnm3;
	}
	
	public static ArrayList<String> getMazePaths(int arr[][], int row, int col) {
		
		// positive base case
		if(row == arr.length - 1 && col == arr[0].length -1) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}
		
		// negative base case
		if(row == arr.length || col == arr[0].length)
			return new ArrayList<String>();
		
		ArrayList<String> rightResults = getMazePaths(arr, row, col + 1);
		ArrayList<String> downResults = getMazePaths(arr, row + 1, col);
		ArrayList<String> myResults = new ArrayList<String>();
		
		for(String path : rightResults) {
			myResults.add("R" + path);
		}
		
		for(String path: downResults) {
			myResults.add("D" + path);
		}
		
		return myResults;
		
	}
	
	
	public static int countHurdleMazePath(int arr[][], int row, int col) {
		// positive base case
		if(row == arr.length - 1 && col == arr[0].length - 1) return 1;
		
		// negative base case
		if(row == arr.length || col == arr[0].length) return 0;
		
		if(arr[row][col] == 1) return 0;
		
		int pathsFromRight = countHurdleMazePath(arr, row, col + 1);
		int pathsFromBottom = countHurdleMazePath(arr, row + 1, col);
		
		return pathsFromBottom + pathsFromRight;
	}
	
	public static void main(String[] args) {
		
//		ArrayList<String> l = subSequence("abc");
//		System.out.println(l);
		
		ArrayList<String> ans = getStairPaths(4);
//		for(String path : ans) {
//			System.out.println(path);
//		}
//		System.out.println(ans);
//		printStairPaths(4, "");
//		System.out.println(countStairPaths(4));
		
		int arr[][] = new int[3][3];
//		ArrayList<String> res = getMazePaths(arr, 0, 0);
//		for(String path : res) {
//			System.out.println(path);
//		}
		arr[0][0] =1;
		System.out.println(countHurdleMazePath(arr, 0, 0));
	}

}
