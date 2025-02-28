package lecture_23;

import java.util.*;

public class fibonacci_rec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibRec(n));

	}

	public static int fibRec(int n) {
		if (n <= 1) { // Base Case
			return n;
		}

		return fibRec(n - 1) + fibRec(n - 2); // Recursive Call

	}
}
