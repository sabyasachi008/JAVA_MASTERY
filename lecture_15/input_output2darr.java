package lecture_15;

import java.util.*;

public class input_output2darr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {		// this loop runs for no of rows
			for (int j = 0; j < m; j++) {	// this loop runs for number of columns 
				arr[i][j] = sc.nextInt();
			}
		}
		display(arr);
	}
	public static void display(int[][]arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
 		}
	}
}
