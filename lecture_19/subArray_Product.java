/*Sliding window :: Variable window size
 * 713 LeetCode :: Subarray Product less than K */



package lecture_19;
import java.util.*;
public class subArray_Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = {1,2,3,4,56};
		System.out.println(productSubarray(arr, k));
	}
	public static int productSubarray(int[] arr, int k) {
		
		int si = 0;
		int ei = 0;
		int n = arr.length;
		int prod = 1;
		int ans= 0;
		
		while(ei<n) {
			//grow phase
			prod *= arr[ei];
			
			
			//shrink phase
			while(prod >= k && si<ei) {
				prod = prod/arr[si];
				si++;
			}
			ans = ans+ei-si+1;					// calculating answer
			
			ei++;
		}
		return ans;
	}
}
