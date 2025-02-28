
/*Kadens Algorithm
 * Time complexity : O(n)
 * */

package lecture_14;
import java.util.*;

public class kadanes_algorithm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 3, -7, 11, -1, 3 };
		kadensAlgo(arr);
	}

	public static void kadensAlgo(int[] arr) {

		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			ans = Math.max(ans, sum);

			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println("The Maximum SubArray Sum is " + ans);
	}
}
