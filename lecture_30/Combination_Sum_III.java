/*Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
 * Only numbers 1 through 9 are used.
 * Each number is used at most once.
 * Return a list of all possible valid combinations. 
 * The list must not contain the same combination twice, and the combinations may be returned in any order.
 * Example 1:
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 * Explanation:
 * 1 + 2 + 4 = 7
 * There are no other valid combinations.*/

package lecture_30;

import java.util.*;

public class Combination_Sum_III {
	public static void main(String[] args) {
		int n = 7; // total sum
		int k = 3; // No of elements in each combinations

		boolean[] board = new boolean[9]; // create a boolean array of 9 size since the nos range from 1 to 9

		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();

		sumHlpr(board, n, k, 0, li, ans, 0);// first 0 -> for qpsf(queen placed so far)
											// second 0 -> for keeping track of the last index of iteration
		System.out.println(ans);

	}

	// qpsf => Queen placed so far
	// last => keep track of the last index
	public static void sumHlpr(boolean[] board, int n, int k, int qpsf, List<Integer> li, List<List<Integer>> ans,
			int last) {

		if (k == qpsf) {
			int sum = 0;
			for (int val : li) { // use advance for loop for finding out the sum of the sum of elements
									// in the list.
				sum += val;
			}

			if (sum == n) { // if sum of list == target
				ans.add(new ArrayList<Integer>(li)); // add to the 2D list
			}
			return;
		}

		for (int i = last; i < 9; i++) { //// Iterate from the element next to the last index
			if (board[i] == false) {
				board[i] = true;
				li.add(i + 1);
				sumHlpr(board, n, k, qpsf + 1, li, ans, i + 1);
				board[i] = false; // backtrack in order to reuse the same element twice
				li.remove(li.size() - 1); // backtrack to remove the duplicate elements
			}
		}
	}

}