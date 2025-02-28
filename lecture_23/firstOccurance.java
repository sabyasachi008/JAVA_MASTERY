package lecture_23;

import java.util.*;

public class firstOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();					//3
		int n = sc.nextInt();						//7
		int[] arr = new int[n];						//{2,3,5,3,7,3,11}
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(firstPresent(0, arr, item));
	} 

	public static int firstPresent(int i, int[] arr, int item) {
		if (i == arr.length) { // in the occurance of element not found
			return -1;
		}

		if (arr[i] == item) { // if item is found it will return the current index without iterating through
								// out the rest of the array
			return i;

		}
		return firstPresent(i + 1, arr, item); // recursive call
	}
}
