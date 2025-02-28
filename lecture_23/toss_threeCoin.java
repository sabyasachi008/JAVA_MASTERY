/*You are give three coins. 
 * You need to print the probable possible outcomes 
 * of the three coins*/

package lecture_23;

import java.util.*;

public class toss_threeCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of coins given
		tossCoin(n, "");
	}

	public static void tossCoin(int n, String toss) {
		if (n == 0) { // baseCase
			System.out.println(toss);
			return;
		}

		tossCoin(n - 1, toss + "H"); // left subTree
		tossCoin(n - 1, toss + "T"); // right SubTree

	}
}
