/*LeetCode :: 40 Combination Sum II 
 * Given a collection of candidate numbers (candidates) and a target number (target), 
 * find all unique combinations in candidates where the candidate numbers sum to target.
 * Each number in candidates may only be used once in the combination.
 * Note: The solution set must not contain duplicate combinations.
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output: 
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 
 *			//There is no infinite supply of coins
 * */

package lecture_30;
import java.util.Arrays;
public class Combination_Sum_II {
	public static void main(String[] args) {
		
		int [] coins = {10,1,2,7, 6, 1, 5};
		int target = 8;
		
		Arrays.sort(coins);
		
		PrintAnswer(coins, target, "",0);
	}
	
	public static void PrintAnswer(int[] coin, int tar, String ans,int last) {
		
		if(tar == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = last; i<coin.length; i++) {
			if(i != last && coin[i] == coin[i-1]) {					//To avoid the formation of duplicate elements
				continue;								//stop the current recursive call and move the next recursive call
				
			}
			
			if(tar >= coin[i]) {
				PrintAnswer(coin, tar-coin[i], ans+coin[i]+" ", i+1);			// We have limited supply so we will iterate from i+1 in order avoid duplicate combinations
						//We cannot use the same coin in the same set so i+1
				
				//Jisko pick krle uske age se pick krnge
			}
		}
	}
}
