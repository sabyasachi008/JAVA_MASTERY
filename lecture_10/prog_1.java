package lecture_10;
import java.util.*;
//Linear Search
public class prog_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //array ke kaunse position m h
		int arr[] = {1,2,3,4,5,-2};
		System.out.println(findElem(arr, n));
	}
	public static int findElem(int[] arr, int n) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

}
