/*To check if the substring is plaindrome or not and print it*/

package lecture_18;
import java.util.*;
public class printPalSubstring {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		printPalSubstring(s);
	}
	
	public static void printPalSubstring(String s) {
		for(int i = 0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				String str = s.substring(i,j);
				if(isPalindrome(str) == true) {
					System.out.println(str);
				}
			} 
		}
	}
	public static boolean isPalindrome(String s) {
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
