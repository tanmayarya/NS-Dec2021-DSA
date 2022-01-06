package JavaBasics;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		// ************************************************8
		// reverse a number
//		int result = 0;
//		
//		while(num > 0) {
//			int lastDigit = num % 10;
//			result = result * 10 + lastDigit;
//			
//			num /= 10;
//		}
//		
//		System.out.println(result);
		
		
		// *************************************************
		// odd even sum
		
		int place = 1, esum = 0, osum = 0;
		
		while(num > 0) {
			int lastDigit = num % 10;
			
			if(place % 2 == 0) {
				esum += lastDigit;
			}else {
				osum += lastDigit;
			}
			place++;
			num /= 10;
		}
		
		System.out.println(esum + ", " + osum);
		
		
// *********************************************************
		// pattern 3; right angle star
		
//		for(int row = 1; row <= num; row++) {
//			
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		
// *********************************************************
		// patter with spaces
		
//		for(int row = 1; row <= num; row++) {
//			
//			// print num - row spaces
//			for(int col = 1; col <= num - row; col++) {
//				System.out.print(" ");
//			}
//			
//			//print star
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//			}
//			
//			// print empty line
//			System.out.println();
//			
//		}
		
// *********************************************************
		// pattern characters
		
		for(int row = 1; row <= num; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print((char)(col + 'A' - 1));
			}
			
			System.out.println();
			
		}
				
		
		
		
		
		
	}

}
