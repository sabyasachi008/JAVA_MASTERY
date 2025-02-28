/*You are given an array you have to return the maximum sum of the subarrays
 * Not optimised solution
 * 
 * 
 *  */
package lecture_13;

import java.util.*;

public class Maximum_sub_array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 3, -7, 11, -1, 3 };
		System.out.println(maxSumSub(arr));
	}

	public static int maxSumSub(int[] arr) {
		int n = arr.length;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;

	}
}
