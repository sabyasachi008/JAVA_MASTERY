package lecture_14;
import java.util.*;
public class first_bad_version {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//
	}
	public static int firstBadVersion(int n) {
		int low = 0;
		int high = n;
		int ans= 0;
		while(low<=high) {
			int mid = (high-low)/2 + low;
			if(isBadVersion(mid) == true) {
				ans = mid;
				high = mid -1;			// If the badVersion contains before the mid arr[mid] >target case
			}
			else  {				//if the badversion contains after the mid (arr[mid] < target case
				low = mid+1;
				
			}
		}
		return ans;
		
	}
	public static boolean isBadVersion(int n) {
		return false;
	}
}
