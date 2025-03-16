/*Leetcode : 647
 *Given a string s, return the number of palindromic substrings in it.
 *A string is a palindrome when it reads the same backward as forward.
 *A substring is a contiguous sequence of characters within the string.
 *Example 1:
 *Input: s = "abc"
 *Output: 3
 *Explanation: Three palindromic strings: "a", "b", "c".
 * */

/*This is the most optimised solution with the time complexity : O(N2)
 * And there is no extra space is used.
 * We know that a plaindromic substring can either be odd length, 
 * Or even length so  Here we are counting the  odd length and even length separately.
 * 
 * */
package lecture_30;

public class Axis_Orbit_Lc647 {
	public static void main(String[] args) {
		String s = "naman";
		System.out.println(plaindromePartitionCount(s));
	}
	
	public static int plaindromePartitionCount(String s) {
		int count = 0;
		
		//for Odd substring => Both start from 0
		for(int axis = 0; axis<s.length(); axis++) {
			for(int orbit = 0; orbit<s.length() && axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt(axis-orbit) != s.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}
		
	
		//for Even substring => both start from 0.5 and increase by 1
		for(double axis = 0.5; axis<s.length(); axis++) {
			for(double orbit = 0.5; orbit < s.length() && axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt((int) (axis-orbit)) != s.charAt((int)(axis+orbit))) {
					break;
					
				}
				count++;
			}
		} 
		
		
		
		return count;
	}
}
