package lecture_31;

public class Quick_Sort {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
		QuickSort(arr, 0, arr.length - 1);

		for (int nums : arr) {
			System.out.print(nums + " ");
		}

	}

	// si -> Start Index
	// ei -> End Index
	public static void QuickSort(int[] arr, int si, int ei) {

		if (si >= ei) {
			return;
		}
		int pi = partition(arr, si, ei);		//get the partition 

		QuickSort(arr, si, pi - 1);			//for the left half without the pivot element
		QuickSort(arr, pi + 1, ei);			//for the right half without the pivot element
	}

	public static int partition(int[] arr, int si, int ei) {

		int item = arr[ei]; // last element jo kuch bhi ho pivot element
		int pi = si;

		for (int i = si; i < ei; i++) { // we will iterate from start index ->0 to ei so that we can place all the
										// element
										// in position and compare at the same with ei -> 4
			if (arr[i] < item) {
				int ii = arr[i];
				arr[i] = arr[pi];
				arr[pi] = ii;
				pi++;
				// this swaps help to keep all the smaller elements to the left
				// and all the larger element at right
			}
		}
		// now swap element of pi index with element of ei index

		int ii = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = ii;

		return pi;
	}

}
