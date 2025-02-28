/*Playing with good string
 * Problem statement :: A good string is a string which contains only vowels(a, e, i, o, u). 
 * 						Given a string S
 * 						Print a string positive integer N where N is 
 * 						the length of the longest SubString of S that is also a good string
 * TLE :: 1 sec
 * input :: cbaeicde
 * output :: 3
 * explaination :: longest good substring "aei";
 * */



package lecture_18;
import java.util.*;
public class goodString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Good_Strings(s));
		
	}
	
	public static int Good_Strings(String s) {
		int ans = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(isVowels(ch) == true) {
				int count = 0; 
				while(i<s.length() && isVowels(s.charAt(i)) == true) {				//  i<s.length()to check whether i is bound or not
					count++;
					i++;
				}
				ans = Math.max(ans, count);
				
			}
		}
		return ans;
		
	}
	
	public static boolean isVowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
