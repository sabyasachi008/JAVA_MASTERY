/*Code to print all the substring of the string including null*/

package lecture_23;
import java.util.*;
public class subsequence_rec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		subRec(s, "");
	}
	
	public static void subRec(String ques, String ans) {
		
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;

		}
		char ch = ques.charAt(0);
		subRec(ques.substring(1), ans);				// Will not take
		subRec(ques.substring(1), ans+ch);			// Will take
	
	}
}