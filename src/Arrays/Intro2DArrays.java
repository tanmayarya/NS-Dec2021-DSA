package Arrays;

public class Intro2DArrays {
	
	public static void printZigZag(int arr[][]) {
		
		for(int row = 0; row < arr.length; row++) {
			
			if(row % 2 == 0) { // even row so print normally
				for(int col = 0; col < arr[row].length; col++) {
					System.out.println(arr[row][col]);
				}
			} else { // odd row so print in reverse
				for(int col = arr[row].length - 1; col >= 0; col--) {
					System.out.println(arr[row][col]);
				}
			}
			
		}
	}
	
	public static void printColumnWise(int arr[][]) {
		
		for(int col = 0; col < arr[0].length; col++) {
		
			for(int row = 0; row < arr.length; row++) {
			
				System.out.println(arr[row][col]);
			}
		}
		
	}
	
	
	public static void printSpiral(int arr[][]) {
		
		int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
		
		int count = 0;
		
		while (count < arr.length * arr[0].length) {
			
			// print left wall
			for(int i = minr; i <= maxr; i++) {
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;
			
			// print bottom wall
			for(int i = minc; i <= maxc; i++) {
				System.out.println(arr[maxr][i]);
				count++;
			}
			maxr--;
			
			// print right wall
			for(int i = maxr; i >= minr; i--) {
				System.out.println(arr[i][maxc]);
				count++;
			}
			maxc--;
			
			// print top wall
			for(int i = maxc; i >= minc; i--) {
				System.out.println(arr[minr][i]);
				count++;
			}
			minr++;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		arr[1][0] = 50;
		arr[1][1] = 60;
		
		int arr2[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}};
		
//		printZigZag(arr2);
//		printColumnWise(arr2);
		printSpiral(arr2);
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.println(arr[row][col]);
//			}
//		}
		
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				arr[row][col] = (row+1) * 10 + (col + 1);
//			}
//		}
//		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col] + ", ");
//			}
//			System.out.println();
//		}
		
		
//		System.out.println(arr[1][2]);
	}
}
