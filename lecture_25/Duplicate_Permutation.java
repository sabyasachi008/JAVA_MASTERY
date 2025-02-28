package lecture_25;

import java.util.*;

public class Duplicate_Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String ans = "";

		dPermutation(ques, ans);
	}

	public static void dPermutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] visited = new boolean[26]; // Array is created of 26 size to store the alphabets

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);

			if (visited[ch - 'a'] == false) { // checks whether the characters is previously visited or not

				visited[ch - 'a'] = true;
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);

				dPermutation(s1 + s2, ans + ch);
			}
		}
	}
}
