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

		
		// Find if a number is Prime or not
//		  int T = scn.nextInt();
//		  int i = 1;
//
//		  while(i <= T) {
//
//			  int num = scn.nextInt();
//			  int val = 2;
//			  boolean isPrime = true;
//			
//			while(val * val <= num) {
//				if(num % val == 0) {
//					isPrime = false;
//					break;
//				}
//				
//				val = val + 1;
//			}
//
//			if(isPrime == true) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//
//			  i = i+1;
//		  }		
		
		// count number of primes from 1 to n
		int n = scn.nextInt();

        int count = 0;
        int numToCheck = 2;

        while (numToCheck <= n) {
              boolean isPrime = true;
              int val = 2;
              while (val * val <= numToCheck) {
                    if(numToCheck % val == 0) {
                          isPrime = false;
                          break;
                    }
                    val = val + 1;
              }
              if(isPrime == true) {
                    count = count + 1;
              }
              numToCheck = numToCheck + 1;
        }  
        System.out.println(count);         
		
		
	}

}
