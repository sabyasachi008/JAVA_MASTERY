package lecture_22;

import java.util.*;

public class fact_tail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(tailFact(n, 1));
	}

	public static int tailFact(int n, int ans) {

		if (n == 0) {
			return ans;
		}

		return tailFact(n - 1, ans * n);

	}
}
