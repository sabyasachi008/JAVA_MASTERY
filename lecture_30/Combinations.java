/*LeetCode : 77 Combinations
 * Given two integers n and k, 
 * return all possible combinations of k numbers chosen from the range [1, n].
 * You may return the answer in any order.
 * Example 1:
 * Input: n = 4, k = 2
 * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
 * */

package lecture_30;

import java.util.*;

public class Combinations {
	public static void main(String[] args) {
		int n = 4;
		int k = 2;

		boolean[] board = new boolean[n];			//not required
		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();

		printAns(board, k, 0, ans, li, 0);

		System.out.println(ans);
	}
	//qpsf => queen placed so far, 
	//k => Total No of queens to be placed
	public static void printAns(boolean[] board, int k, int qpsf, List<List<Integer>> ans, List<Integer> li, int last) {

		if (k == qpsf) {	//When we are done placing all the queens
			ans.add(new ArrayList<Integer>(li)); // since we are removing the elements from the list
													// we have to create a new ArrayList at other location
													// and save the data there or else it will add empty list to the
													// 2D ArrayList
			return;
		}

		for (int i = last; i < board.length; i++) {
			if (board[i] == false) {	//not required
				board[i] = true;		//not required
				li.add(i + 1);
				printAns(board, k, qpsf + 1, ans, li, i + 1);
				board[i] = false;
				li.remove(li.size() - 1); // Backtrack to remove duplicate elements
			}
		}
	}
}

/*PS : Here since we are keeping track of the elements and adding to the list it is not necessary to keep
 * 	   track of it in the boolean[] board array.  */
