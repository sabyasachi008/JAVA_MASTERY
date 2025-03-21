/* LEETCODE : 79 Subsets
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 * */

package lecture_30;

import java.util.*;

public class Subset {
	public static void main(String[] args) {

		int[] sub = { 1, 2, 3 };
		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();

		subSetPrint(sub, 0, li, ans);
		System.out.println(ans);

	}

	public static void subSetPrint(int[] sub, int i, List<Integer> li, List<List<Integer>> ans) {

		if (i == sub.length) {
			ans.add(new ArrayList<Integer>(li)); // to add the element to the new location since li.remove is used
			return;
		}

		/*
		 * ans.add(new ArrayList<Integer>(li)); 
		 * This is crucial because it ensures that a new copy of the current subset (li) is added to ans.
		 * 
		 *  li is a reference to a mutable list When we modify li
		 * in subsequent recursive calls (by adding or removing elements), those changes
		 * will also reflect in ans if we store li directly. Creating a new
		 * ArrayList<Integer>(li) ensures that the current state of li is captured
		 * independently This way, even if li changes later, ans retains the correct
		 * subset.
		 */

		subSetPrint(sub, i + 1, li, ans); // Recursive call for no take
		li.add(sub[i]); // Add to the list when take
		subSetPrint(sub, i + 1, li, ans); // Recursive call for take
		li.remove(li.size() - 1); // Remove from the list in order to
	}
}
