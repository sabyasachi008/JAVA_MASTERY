
/*Question:: you are given two sorted arrays arr1, arr2;
 * You have to merge to sorted arrays and return the sorted array
 * 
 * Brute force :: create the new array of size[arr1.length+arr2.length]
 * add the elements of the first array to the new array
 * then add the elements of the second array to the new array 
 * then sort the array using Arrays.sort function
 * time complexity :: 	O((M+N)Log(m+n)); where m -> arr1.length
 * 									 where n -> arr2.length
 * 
 * Optimised way :: Using 3 pointers as done below;
 * Time complexity : O(N+M)
 * */
package lecture_31;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 5, 7, 9, 11, 15};
		int[] arr2 = {1, 2, 4, 5, 6, 7}; 
		int[] res = MergeTwoArrays(arr1, arr2);
		
		for(int num : res) {
			System.out.print(num+" ");
		}
	}
	
	public static int[] MergeTwoArrays(int[] arr1, int[] arr2) {
		
		//take 3 pointers
		int i = 0;		//for arr1;		-> i
		int j = 0;		//for arr2;		-> j
		int k = 0;		//for traversing through the new array
		
		int[] ans = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {		//while both are in range check 
			if(arr1[i] < arr2[j]) {				//check for the smallest using i & j
				ans[k] = arr1[i];				//place the smallest using the k pointer to the new array  
				i++;
				k++;
			}
			else {					//else if(arr2[j] < arr1[i])
				ans[k] = arr2[j];
				j++;
				k++; 
			}
		}
		
		
		//When one of the two out of bound check for it individually the on which is in range will run 
		//and add rest of the remaining elements to the array.
		while(i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		
		return ans;
	}

}
