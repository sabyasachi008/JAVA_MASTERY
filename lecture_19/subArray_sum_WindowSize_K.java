/*Sliding window approach :: Variable window size*/

package lecture_19;

import java.util.*;

public class subArray_sum_WindowSize_K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); 			// Arraylength
//		int[] arr = new int[n];			// take input array
//		int k = sc.nextInt();			// Window size

		int[] arr = { 2, 3, 14, 7, 11, 13, 18, 16 };
		int k = 3;
		subArraySum(arr, k);

	}

	public static void subArraySum(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		for(int i = k; i<arr.length; i++) {
			sum += arr[i];
			sum = sum - arr[i-k];
			ans = Math.max(sum, ans);
		}
		System.out.println(ans);

  	}
}
