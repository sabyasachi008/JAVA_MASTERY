package lecture_24;
import java.util.*;
public class count_subString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.print(ansCount(s, ""));
	}
	
	public static int ansCount(String que, String ans) {
		
		if(que.length() == 0) {
			
			return 1;
		}
		
		char ch = que.charAt(0);
		int a = ansCount(que.substring(1), ans);
		int b = ansCount(que.substring(1), ans+ch);
		return a+b;
	}
}
