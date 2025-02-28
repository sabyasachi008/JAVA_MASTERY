package lecture_11;
import java.util.*;
/* SELECTION SORT
 * Time complexity :: O(n2)
 * 
 * */
public class selection {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	 
		int arr [] = {3,4,1};
		selectionSort(arr);
		
		for(int nums : arr) {
			System.out.print(nums+" ");
		}
		
	}
	public static void selectionSort(int [] arr) {
		for(int i = 0; i<arr.length; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
	}
}
