
/*You are given an element k and a array 
 * we have to place the element in the array in such a way 
 * that the small numbers from k is on the left side and the larger number are on the right side
 * 
 * 
 * Input :: {{5, 7, 2, 3, 8, 9, 1, 4}}, K = 4
 * 
 * Output :: {2, 3, 1, 4, 9, 5, 7}
 * And also return the index of the swapped K *(here k = 3)
 * 
 * */
package lecture_31;

public class Partition_in_Array {
	public static void main(String[] args) {
		int[] arr = {5, 7, 2, 3, 8, 9, 1, 4};		//k -> 9 4
		
		int ans = partition(arr, 0, arr.length - 1);
		System.out.println(ans);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	//Si => Start Index
	//Ei => End Index
	public static int partition(int[] arr, int si, int ei) {
		
		int item = arr[ei];			//last element jo kuch bhi hoga
		int pi = si ;
		
		for(int i = si; i<ei; i++) {		//we will iterate from start index ->0 to ei-1 so that 
											// we can place all the element in position and compare at the same with ei->4
			if(arr[i] < item) {
				int ii = arr[i];
				arr[i] = arr[pi];
				arr[pi] = ii;
				pi++;			
							//this swaps help to keep all the smaller elements to the left
							//and all the larger element at right
			}
		}
						//now swap element of pi index with element of ei index
		int ii = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = ii;
		return pi;
		 
	}
}
