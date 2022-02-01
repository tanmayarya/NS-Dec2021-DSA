package Arrays;

public class BinarySearchIntro {

	public static int binarySearch(int arr[], int val) {
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			// calculate mid
			int mid = (left + right) / 2;
			
			if(arr[mid] == val) {
				return mid;
			}
			else if(arr[mid] < val) {
				left = mid + 1;
			}
			else { //arr[mid] > val
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static int firstOccurenceOfVal(int arr[], int val) {
		
		int left = 0, right = arr.length - 1, ans = -1;
		
		while(left <= right) {
			// calculate mid
			int mid = (left + right) / 2;
			
			if(arr[mid] == val) {
				ans = mid;
				right = mid - 1;
			}
			else if(arr[mid] < val) {
				left = mid + 1;
			}
			else { //arr[mid] > val
				right = mid - 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(arr, 11));
	}

}
