
/*LEET CODE : Qs :: 17
 * This code's function part is done with respect to the scenarios given in leetCode
 *  if needed kindly make adjustments.
 * */

package lecture_25;

import java.util.*;

public class letter_combination_phnNo {

	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String ans = "";
		List<String> list = new ArrayList<>();
		if(ques.length() == 0) {
			System.out.println(list);
		}
		
		KeyPress(ques, ans, list);
		System.out.println(list);
	}

	public static void KeyPress(String ques, String ans, List<String> list) {

		if (ques.length() == 0) {
//			System.out.println(ans);
			list.add(ans);
			return;
		}
		char ch = ques.charAt(0);

		String press = key[ch - '0'];

		for (int i = 0; i < press.length(); i++) {
			KeyPress(ques.substring(1), ans + press.charAt(i), list);
		}
	}
}
