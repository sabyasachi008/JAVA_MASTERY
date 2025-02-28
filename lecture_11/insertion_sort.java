 package lecture_11;
import java.util.*;

/*INSERITON SORT
 * Time complexity :: O(n2) {Worst Case}
 *  Assume that the left most element is always sorted	
 * 				  O(n)  {Best Case}
 * */
public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int arr[] = {13,-2,1,4,3,2,-6,5};
		
		insertSort(arr);
		
		for(int nums : arr) {
			System.out.print(nums+" ");		
		}
	}
	
	public static void insertSort(int arr[]) {
		for(int i = 1; i<arr.length; i++) {
			int item = arr[i];
			int j = i- 1;
			while(j>= 0 && arr[j] > item) {
				arr[j+1] = arr[j];
				arr[j] = item;
				j--;
			}
//			j++;
//			arr[j] = item;
		}
		
	}

}
 