package JavaBasics;

public class Conditionals {

	public static void main(String[] args) {
		
		int day = 4;
		
//		if(day == 1) {
//			System.out.println("Monday");
//		}
//		else if(day == 2) {
//			System.out.println("Tuesday");
//		}
//		else if(day == 3) {
//			System.out.println("Wednesday");
//		}
//		else if(day == 4) {
//			System.out.println("Thursday");
//		}
//		else if(day == 5) {
//			System.out.println("Friday");
//		}
//		else if(day == 6) {
//			System.out.println("Saturday");
//		}
//		else if(day == 7){
//			System.out.println("Sunday");
//		}
//		else {
//			System.out.println("invalid day");
//		}

		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid day");
		
		}
		
		int result = 121 % 2;
		switch(result) {
		case 0: 
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		}
		
		int a = 100;
		int b = 25;
		char c = '*'; // +, -, *, /, %
		
		// a op b
	}
}
