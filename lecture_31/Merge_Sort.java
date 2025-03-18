/*In Merge sort we are not change the given array
 * rather we are creating several sorted arrays and returning 
 * a final single sorted array
 * */

package lecture_31;

public class Merge_Sort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 4, 2 };

		int[] result = MergeSort(arr, 0, arr.length - 1);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] MergeSort(int[] arr, int si, int ei) {

		if (si == ei) { // when single sorted element found so si == ei
			int[] bs = new int[1]; // add element to the new array of 1 space;
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei) / 2;

		int[] a = MergeSort(arr, si, mid);
		int[] b = MergeSort(arr, mid + 1, ei);

		return MergeTwoArray(a, b);
	}

	public static int[] MergeTwoArray(int[] a, int[] b) {

		// take 3 pointers
		int i = 0; // for a -> i
		int j = 0; // for b -> j
		int k = 0; // for new array => k

		int[] ans = new int[a.length + b.length];

		while (i < a.length && j < b.length) { // while both in range will check
			if (a[i] < b[j]) { // if a[i] or b[j] is smaller
				ans[k] = a[i]; // place at ans[k] and increment k
				i++;
				k++;
			} else { // if(b[j] < a[i])
				ans[k] = b[j];
				j++;
				k++;
			}
		}

		// When one of the two out of bound check for it individually the on which is in
		// range will run
		// and add rest of the remaining elements to the array.
		while (i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		return ans;
	}

}
