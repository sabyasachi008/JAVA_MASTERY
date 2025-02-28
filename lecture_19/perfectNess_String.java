/*Sliding window :: Variable window size
 * Check the perfectNess of string only a or only b 
 * input : string s = "abababbaaaaabbb", K = 3
 * output : 10 
 * */


package lecture_19;
import java.util.*;
public class perfectNess_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();						// 3
		String s = sc.next();						// abababbaaaaabbb
		int flipa = flipchar(s, k, 'a');			// String where perfectness is all a
		int flipb = flipchar(s, k, 'b');			// string where perfectness is all b
		
		System.out.println(Math.max(flipa, flipb));
	}
	public static int flipchar(String s, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		
		while(ei<s.length()) {
			if(s.charAt(ei) == ch) {				// Grow phase
				flip++;
			}
			
			while(flip>k && si<=ei) {				// Shrink phase
				if(s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			
			ans = Math.max(ans, ei-si+1);
			ei++;		
		}
		return ans;
		 
	}
}
