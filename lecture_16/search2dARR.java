
/*Give a sorted 2d matrix of n*m order find the target element
 * Approach : staricase method starting from the the top right most element of the array
 * Time complexity : O(n+m)
 * 
 * */

package lecture_16;

import java.util.*;

public class search2dARR {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		/*
		 * 2D- Array user Input int n = sc.nextInt(); int m = sc.nextInt(); int[][] arr
		 * = new int[n][m]; for(int i = 0; i<n; i++) { for(int j = 0; j<m; j++) {
		 * arr[i][j] = sc.nextInt(); } }
		 */
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 16 }, { 3, 6, 9, 13, 17 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.print(searchHelper(arr, target));

	}

	public static boolean searchHelper(int[][] arr, int target) {
		int row = 0; // start from the 0th row
		int col = arr[0].length - 1; // start from the right most col

		while (row < arr.length - 1 && col >= 0) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] < target) {
				// if arr[row][col]<target going towards left wont be helpfull because in sorted
				// array all elemented towards left will be smaller than target
				row++;
			}

			else {
				// if (arr[row][col] > target )
				// if arr[row][col]> target going downwards wont be helpfull because in sorted
				// array all the elements below the current element will be bigger
				col--;
			}
		}
		return false; // if not found
	}
}
