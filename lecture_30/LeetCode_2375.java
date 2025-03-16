/*LeetCode :: 2375
 * 
 * You are given a 0-indexed string pattern of length n consisting of 
 * the characters 'I' meaning increasing and 'D' meaning decreasing.
 * 
 * A 0-indexed string num of length n + 1 is created using the following conditions:
 * num consists of the digits '1' to '9', where each digit is used at most once.
 * If pattern[i] == 'I', then num[i] < num[i + 1].
 * If pattern[i] == 'D', then num[i] > num[i + 1].
 * Return the lexicographically smallest possible string num that meets the conditions.
 * 
 * Example 1:
 * Input: pattern = "IIIDIDDD"
 * Output: "123549876"
 * Explanation:
 * At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
 * At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
 * Some possible values of num are "245639871", "135749862", and "123849765".
 * It can be proven that "123549876" is the smallest possible num that meets the conditions.
 * Note that "123414321" is not possible because the digit '1' is used more than once.*/

package lecture_30;
import java.util.*;

public class LeetCode_2375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		minimum_number_from_given_Sequence(s);
		
	}
	
	public static void minimum_number_from_given_Sequence(String str) {
		int[] ans = new int[str.length()+1];
		int num = 1;
		
		// For filling up the Elements in increasing order
		for(int i = 0; i<= str.length(); i++) {
			if(i == str.length() || str.charAt(i) == 'I') {		//in Increasing order where ever I present start placing from 1
				ans[i] = num;
				num++;
				
				for(int j = i-1; j>=0 && str.charAt(j) == 'D'; j--) {	// When I is placed start placing from i-th element in reverse increasing order in the array
																		//until str.charAt(j) == 'D'
					ans[j] = num;
					num++;
				}
			}
		}
		
		
		for(int k : ans) {		//To print the answer array
			System.out.print(k);
		}
		System.out.println();
	}
}
 