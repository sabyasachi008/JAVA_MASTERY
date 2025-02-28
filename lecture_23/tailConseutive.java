/*To avoid printing all the consecutive tails
 * 
 * n = 3
 * output :THT 
THH 
HTH 
HHT 
HHH 
 */



package lecture_23;

import java.util.*;

public class tailConseutive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printToss(n, "");
	}

	public static void printToss(int n, String s) {
		if (n == 0) {
			System.out.print(s + " ");
			return;
		}

		if (s.length() == 0 || s.charAt(s.length() - 1) != 'T') {
			printToss(n - 1, s + 'T');
		}

		printToss(n - 1, s + 'H');
	}
}
