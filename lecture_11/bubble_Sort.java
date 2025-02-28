package lecture_11;
import java.util.*;

/*BUBBLE SORT
 * Time complexity :: O(N2) {worst case}
 * 					  n(On) {Best case}
 * */

public class bubble_Sort {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		//Ascending order
	 	int arr[] = {1,-9,4,4,2,5};
	 	bubbleSort(arr);
	}
	public static void bubbleSort(int arr[]) {
		for(int turn = 1; turn<arr.length;turn++) {
			
			for(int i = 0; i<arr.length-turn; i++) {			// it will run up to n-1 turns
				if(arr[i]>arr[i+1]) { 
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
