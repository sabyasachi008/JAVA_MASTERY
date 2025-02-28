package lecture_24;

import java.util.*;

public class count_subString {
	static int count = 0;					// define a global variable
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "abc";
		
		subString(s, "");
		System.out.println(count);
	}
	
	public static void subString(String que, String ans) {
		if(que.length() == 0) {
			System.out.print(ans+" ");
			count++;							//Increment the gobal variable
			return;
		}
		
		char ch = que.charAt(0);
		
		subString(que.substring(1), ans);
		subString(que.substring(1), ans+ch);
		
	}
}
