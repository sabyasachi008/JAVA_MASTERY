package lecture_10;
import java.util.*;
public class min_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {-9,-4,3,5,3,-1};
		findMin(arr);
		
	}
	public static void findMin(int arr[]) {
		int min = 0;
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] <arr[min]) {
				min = i;
			}
		} 
		System.out.println("The minimum element index " + min);
		System.out.println("The value of the index : " +arr[min]);
	}

}
