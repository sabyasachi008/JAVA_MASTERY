/*LeetCode :: 90 Subset - II 
 * Concept used : Combination_sum_II && Subsets
 * Since limited supply so we iterate from i+1 element in recusive call
 * */
package lecture_30;

import java.util.*;

public class Subset_II {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };

		Arrays.sort(arr);

		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		subsetHlpr(arr, li, ans, 0);
		System.out.println(ans);

	}

	public static void subsetHlpr(int[] arr, List<Integer> li, List<List<Integer>> ans, int last) {

		ans.add(new ArrayList<Integer>(li));

		for (int i = last; i < arr.length; i++) {
 
			if (i != last && arr[i] == arr[i - 1]) {	//To stop the formation of duplicate elements
														
				continue;						//Stop the current recursive call and move to the next recursive call
			}

			li.add(arr[i]);
			subsetHlpr(arr, li, ans, i + 1);  //We are only taking the recursion in which we take elements
			li.remove(li.size() - 1);
		}

	}
}
