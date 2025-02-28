package lecture_23;
import java.util.*;
public class LastOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(lastOccur(arr, item, n-1));
	}
	public static int lastOccur(int[] arr, int item, int i) {
		
		if(arr[i] == 0) {
			return -1;
		}
		if(arr[i] == item) {
			return i;
		}
		
		return lastOccur(arr, item, i-1);
	}
}
