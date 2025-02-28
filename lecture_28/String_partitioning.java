/*To print the number of ways the string
 * can be broken down*/
package lecture_28;

import java.util.*;

public class String_partitioning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		partition(s, "");
		sc.close();
	}

	public static void partition(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			partition(ques.substring(i), ans + s + "|");

		}
	}
	
	/*To complete the plaindrome partion problem 
	*just add the boolean function to check 
	*plaindrome string and before send recursive call 
	*check whether the ans is plaindrome or not.
	*/
}
