/*Print only those who does not have 2 consecutive head
 * for n = 3; n:: number of coins
 * TTH
 * HTH
 * THT
 * TTT
 * HTT
 * */


package lecture_23;
import java.util.*;
public class coin_TossConditonal {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		coinHead(n,"");
	}
	public static void coinHead(int n, String toss) {
		if(n == 0) {
			System.out.println(toss);
			return;
		}
		
		char ch = 'H';
		if(toss.length() == 0 || toss.charAt(toss.length()-1) != ch) {				// to check for n = 0
			
			coinHead(n-1, toss+"H");
		}
		
		coinHead(n-1, toss+'T');
	}
}
