/*To check whether the given string is plaindrom or not 
 * Two pointer approach
 * */

package lecture_18;
import java.util.*;
	
public class plaindromStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(checkPalindrome(s));
		
	}
	public static boolean checkPalindrome(String s) {
		
		
//		int flag = 0;
//		int i = 0; 
//		int j = s.length()-1;
//		while(i<j) {
//			if(s.charAt(i) == s.charAt(j)) {
//				i++; 
//				j--;
//			}
//			else {
//				flag = 1;			// not palindrome
//				break;
//			}
//		}
//		if(flag == 0) return true;
//		return false;
		
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
