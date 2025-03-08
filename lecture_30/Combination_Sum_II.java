/*Given an array of distinct integers candidates and a target integer target, 
 * return a list of all unique combinations of candidates where the chosen numbers sum to target. 
 * You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times. 
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * The test cases are generated such that the number of unique combinations,
 * that sum up to target is less than 150 combinations for the given input.
 * 
 * Example 1:
 * 
 * Input: candidates = [2,3,6,7], target = 7
 * 
 * Output: [[2,2,3],[7]]
 * 
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7. 
 * These are the only two combinations.
 * 
 * Combinations means no repeated arrangements.*/

package lecture_30;

import java.util.ArrayList;
import java.util.List;
public class Combination_Sum_II {
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int tar = 7;
		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		
		sumHlpr(arr, tar, li, ans, 0);
		System.out.println(ans);
	}
	
	public static void sumHlpr(int[] arr, int tar, List<Integer> li, List<List<Integer>> ans, int last) {
		
		if(tar == 0) {
			ans.add(new ArrayList<Integer>(li));

			return;
		}
		
		
		for(int i = last; i<arr.length; i++) {
			if(tar >= arr[i]) {
				li.add(arr[i]);
				sumHlpr(arr, tar-arr[i], li, ans, i);	//The recursive call is placed from the i-th element itself because there is a unlimited supply of coins
				li.remove(li.size() -1);			//We have to backtrack to remove duplicate elements
				
			}
		}
	}

}
