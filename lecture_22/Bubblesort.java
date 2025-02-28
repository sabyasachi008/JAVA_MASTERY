package lecture_22;
import java.util.*;
public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		bs(arr, n);
	}
	
	public static void bs(int[] arr, int n) {
		for(int turn = 1; turn < n; turn ++) {
			for(int i = 0; i<n-turn; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		for(int nums : arr) {
			System.out.print(nums+" ");
		}
	}
}
