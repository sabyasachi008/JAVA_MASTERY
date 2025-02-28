/**/

package lecture_24;
import java.util.*;
public class generate_parenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();						// Create a list in the heap memory
		System.out.println(GenerateParenthesis(n, 0, 0, "", list));
		
	}
	
	public static List<String> GenerateParenthesis(int n, int open, int close, String ans, List<String> list) {
		
		if(open == n && close == n) {
			list.add(ans);					//add the ans to the list
		}
		if(open < n) {
			
			GenerateParenthesis(n, open+1, close, ans+"(", list);
		}
		
		if(close < open) {
			
			GenerateParenthesis(n, open, close+1, ans+")", list);
		}
		return list;
	}
}
