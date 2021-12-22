package JavaBasics;

import java.util.Scanner;

public class PracticeQuestions {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		// odd even
//		int num = scn.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("Even Number");
//		}else {
//			System.out.println("Odd Number");
//		}

		
		int num = scn.nextInt();
		
		int val = 2;
		
	
		while(val < num) {
			if(num % val == 0) {
				break;
			}
			val = val + 1;
		}
		
		if(val == num) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
		
		
	}

}
