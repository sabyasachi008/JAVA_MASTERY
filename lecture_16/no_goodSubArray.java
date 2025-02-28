
/*Pegion hole approach
 * //CP
 * bhenke land aukaat m CP h
 * */

package lecture_16;
import java.util.*;
public class no_goodSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();			//Number of testcases
		
		while(t-->0) {			// postdecrement operator similar to t-- at the end
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i =0; i<n; i++) {
				arr[i] = sc.nextInt();
				
			}
					//instead if t-- we took post decrement operator while(t-->0)
			
			System.out.println(GoodSubArr(arr, n));
		}
		
	}
	public static long GoodSubArr(int[] arr, int n) {
		long[] frq = new long[n];
		long sum = 0;
		frq[0] = 1;			//1st time 0 mein hu issk liye freq 1 liye hu
		for(int i = 0; i<arr.length; i++) {
			sum = sum +arr[i];
			int idx = (int) sum%n;
			if(idx < 0) {						// -7 reminder->> postive integer = 3rd index {-7-3} 
				idx += n;
			}
			frq[idx] = frq[idx] +1;
		}
		long ans = 0;
		for(int i = 0; i<frq.length; i++) {
			if(frq[i] >= 2) {
				long p = frq[i];
				ans = ans + (p*(p-1))/2;
			}
		}
		return ans;
		
	}
}
