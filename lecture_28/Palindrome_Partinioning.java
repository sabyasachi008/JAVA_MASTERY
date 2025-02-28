/*Leet code :: QsNo:: 131 Palindrome partition*/

package lecture_28;

import java.util.*;

public class Palindrome_Partinioning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> li = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();

		partition(s, li, ans);
		System.out.println(ans);
		sc.close();

	}

	public static void partition(String ques, List<String> li, List<List<String>> ans) {

		if (ques.length() == 0) {

			ans.add(new ArrayList<>(li));				//create a new ArrayList and copy the list and add it 
														// to the 2D list	
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (ispalindrome(s)) { 
				li.add(s);
				partition(ques.substring(i), li, ans);
				li.remove(li.size() - 1); // Backtrack to Remove the extra elements added in the list
			}
		}
	}

	public static boolean ispalindrome(String s) {

		int i = 0, j = s.length() - 1;

		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
