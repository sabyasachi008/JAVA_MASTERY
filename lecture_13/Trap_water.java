/*
 * Trapping Rain water 
 * */
package lecture_13;

import java.util.*;

public class Trap_water {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] arr = new int[n];
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trapWater(arr));

	}

	public static int trapWater(int[] arr) {

		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		int sum = 0;
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			sum += (Math.min(left[i], right[i]) - arr[i]);
		}

		return sum;
	}

}
