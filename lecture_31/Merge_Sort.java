package lecture_31;

public class Merge_Sort {
	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 4, 2};
		
		
		int[] result = MergeSort(arr, 0, arr.length-1);
		for(int i : result) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] MergeSort(int[] arr, int si, int ei) {
		
		if(si == ei) {				// when single sorted element found so si == ei
			int[] bs = new int[1];	// add element to the new array of 1 space;
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		
		int[] a = MergeSort(arr, si, mid);
		int[] b = MergeSort(arr, mid+1, ei);
		
		return MergeTwoArray(a, b);
	}
	
	public static int[] MergeTwoArray(int[] a, int[] b) {
		
		int i = 0;
		int j = 0; 
		int k = 0;
		
		int[] ans = new int[a.length+b.length];
		
		while(i<a.length && j<b.length) {
			if(a[i] < b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			}
			else {			//if(b[j] < a[i])
				ans[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		while(j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		return ans;
	}
	
}
