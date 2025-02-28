/*
 *
 Binary search will only be applied where data is sorted
	Or sorted Search Order
	Time complexity : O(nlogn)
	Space Complexity : O(1)
 *
 * the Approach is called divide and conquer
 * Iterative Method
 * */


package lecture_14;
import java.util.*;
public class binary_Search {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = sc.nextInt();
		int[] arr ={1,2,3,4,5,6,7,8};
		int n = arr.length;
		int ans = helperBinarySearch(arr, n, target);
		if(ans == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at index No "+ans);
		}
		
	}
	public static int helperBinarySearch(int[]arr, int n, int target) {
		int low = 0, high = n-1;
		while(low<=high) {
			
			int mid = (low + high)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] > target) {
				high = mid-1;
			}
			else {		//if(arr[mid] < target)
				low = mid+1;

			}
		}
		return -1;
	}
}