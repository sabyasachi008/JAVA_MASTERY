package lecture_22;

import java.util.*;

public class print_Rev2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		printIncr(n);
	}

	public static void printIncr(int n) {
		if (n == 0) {
			return;
		}
		printIncr(n - 1);
		System.out.println(n);

	}
}
