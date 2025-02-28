/*Time complexity of Linear Search : O(N)
 * Space complexity : O(1);
 * */

package lecture_10;
import java.util.*;
public class linear_Search {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,3,4,5,39};
		int target = sc.nextInt();
		System.out.println(linearHelper(arr, target));
	}
	public static boolean linearHelper(int[] arr, int target) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == target) return true;
		}
		return false;
	}

}
