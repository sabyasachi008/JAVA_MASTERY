package lecture_25;

import java.util.*;

public class prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of row
		int m = sc.nextInt(); // no of col

		printPath(0, 0, n - 1, m - 1, "");				// is indexing is 0 based
		
	}

	// cr = current Row
	// cc = current column
	// er = end row
	// ec = end col

	public static void printPath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cc > ec || cr > er) { 
			return;
		}
		printPath(cr, cc + 1, er, ec, ans + "H");
		printPath(cr + 1, cc, er, ec, ans + "V");

	}
}
