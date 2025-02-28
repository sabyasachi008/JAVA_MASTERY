package lecture_20;

import java.util.*;

public class Arrays_Sumof2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}

		SumArr(n, arr, m, arr1);

	}

	public static void SumArr(int n, int[] arr, int m, int[] arr1) {

		int carry = 0;
		int i = arr.length - 1;
		int j = arr1.length - 1;
		ArrayList<Integer> li = new ArrayList<>();			// to store the answer
		while (i >= 0 || j >= 0) {				//iterate from the last element
			int sum = 0;
			if (i >= 0) {
				sum += arr[i];
				i--;
			}
			if (j >= 0) {
				sum += arr1[j];
				j--;
			}

			sum += carry;
			li.add(sum % 10);			// to get the remainder  the last element
			
			carry = sum / 10;			// to get the carry element 

		}
		if (carry > 0) {				//if it have any element in carry after i&j<0
			li.add(carry);
		}

		for (int k = li.size() - 1; k >= 0; k--) {			// print the Arraylist on reverse order
			System.out.print(li.get(k) + " ");
		}

	}
}
