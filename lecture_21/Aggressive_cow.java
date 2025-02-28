/* Question :: Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. 
The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

Input

t-the number of test cases, then t test cases follows.

* Line 1: Two space-separated integers: N and C

* Lines 2..N+1: Line i+1 contains an integer stall location, xi

Output

For each test case output one integer: the largest minimum distance.

Approach :: Binary Search
*/

package lecture_21;

import java.util.*;

public class Aggressive_cow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int nos = sc.nextInt();			//no of stalls	
			int noc = sc.nextInt();			// no of cows
			
			int[] stall = new int[nos];
			for(int i = 0; i<stall.length; i++) {
				stall[i] = sc.nextInt();
				
			}
			Arrays.sort(stall);
			System.out.println(largestMinDistance(stall, nos, noc));
			t--;
		}
	}
	public static int largestMinDistance(int[] stall, int nos, int noc) {
		int low = 0;
		int high = stall[nos-1] - stall[0];
		
		int ans = 0;
		while(low<= high) {
			int mid = (low+high)/2;
			
			if(isItpossible(stall, noc, mid) == true) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static boolean isItpossible(int[] stall, int noc, int mid) {
		
		int cow = 1;			//place the first cow in the first stall in every case
		int pos = stall[0];
		int i = 1;
		
		while(i<stall.length) {
			if(stall[i]-pos >= mid) {
				cow++;
				pos = stall[i];
			}
			
			if(cow == noc) {
				return true;
			}
			i++;	
		}
		return false;
	}
}