package lecture_13;
/**
 * Product of the array instead of itself
 * Time complexity : O(n)
 */
import java.util.*;

public class Product_arr_except_self {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int[] arr = { 2, 4, 3, 5, 4, 5 };
//		for(int i = 0; i<n; i++) {
//			arr[i] = sc.nextInt();
//			
//		}

		int[] last = prodArr(arr);
		for (int nums : last) {
			System.out.print(nums + " ");
		}
	}

	public static int[] prodArr(int[] arr) {
		int[] left = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		int[] right = new int[arr.length];
		right[arr.length - 1] = 1;
		for (int j = arr.length - 2; j >= 0; j--) {
			right[j] = right[j + 1] * arr[j + 1];
		}
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}

		return left;

	}
}
