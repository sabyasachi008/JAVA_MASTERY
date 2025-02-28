package lecture_25;
import java.util.*;
public class PermutationString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		
		String ans = "";
		
		permutation(ques, ans);
	}
	
	public static void permutation(String s, String ans) {
		
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i<s.length(); i++) {
			String s1 = s.substring(0, i);
			String s2 = s.substring(i+1);
			
			permutation(s1+s2, ans+s.charAt(i));
		}
	}
}
