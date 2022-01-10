package Arrays;

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
	
	public static void main(String[] args) {
		
		int a[] = {10, 20, -50, 100, 60, -200, 20};
//		System.out.println(getMax(a));
//		OddEvenSum(a);
//		System.out.println(isElementRepeated(a, 20));
		
		int arr[] = {10, 20 ,30 ,1, 40, 30, 20, 60};
		
		System.out.println(repeatedNumber(arr));
		
	}
}
