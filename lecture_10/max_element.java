package lecture_10;
import java.util.*;
public class max_element {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[]  = {1,3,2,4,6};
		findMax(arr);
	}
	public static void findMax(int arr[]) {
		int max = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> arr[max]) {
				max = i;
			}
			
		}
		System.out.println("The maximum index element : "+max);
		System.out.println("The value of the index : "+arr[max]);
	}
}
