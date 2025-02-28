package lecture_23;

import java.util.*;

public class allOcc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		allOcc(arr, item, 0);
	}

	public static void allOcc(int[] arr, int item, int i) {

		if (i == arr.length) {
			System.out.println("Element Not found");
			return;
		}
		if (arr[i] == item) {
			System.out.print(i + " ");
		}
		if (i < arr.length - 1) { // add this condition
			allOcc(arr, item, i + 1);
		}
	}
}
