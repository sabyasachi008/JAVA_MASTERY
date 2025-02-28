/*Give a dice has 3 faces{1,2,3} 
 * destination n = 4
 * calculate the number of possible outcomes through recursion*/

package lecture_24;

import java.util.*;

public class boatPath_count {

	static int cnt = 0; // using static variable method

	public static void count(int cur, int n, String s) {
		if (cur == n) {
			cnt++;
		}
		if (cur > n) {
			return;
		}
		for(int dice = 1; dice<=3; dice++) {	
			count(cur + dice, n, s + dice);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		count(0, n, "");
		System.out.println(cnt);

	}

//	public static int count(int cur, int n, String s) {
//		
//		if(cur == n) {
//			return 1;
//		}
//		if(cur > n) {
//			return 0;
//		}
//		
//		int a = count(cur+1, n, s+1);
//		int b = count(cur+2, n, s+2);
//		int c = count(cur+3, n, s+3);
//		
//		return a+b+c;
//	}

}
