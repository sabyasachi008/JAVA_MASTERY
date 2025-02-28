package lecture_10;
import java.util.*;
public class rotate_arr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		/*
		 * [1,2,3,4,5,6,7]    // k = 4 
		 * k = 1 [7,1,2,3,4,5,6]
		 * k = 2 [6,7,1,2,3,4,5]
		 * k = 3 [5,6,7,1,2,3,4] to return this output
		 * 
		 * */
		int arr[] = {1,2,3,4,5,6,7};
		rotateArr(k, arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	public static void rotateArr(int k, int[] arr) { 
		int n = arr.length;
	
//		k = k%n;
		while(k>0) {
			int temp = arr[n-1];
			for(int i = n-2; i>=0; i--) {
				arr[i+1] = arr[i];
			} 
			arr[0] = temp;
			k--;
		}
		
	}
}
