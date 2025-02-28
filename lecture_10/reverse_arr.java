package lecture_10;
import java.util.*;
public class reverse_arr {

	/*
	 * input =>  2,3,1,7,8,9
	 * output => 9,8,7,1,3,2
	 * using two pointers method
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {2, 3, 1, 7, 8, 9};
		revArr(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void revArr(int arr[]) {
//		for(int i = arr.length-1; i>=0; i--) {
//			System.out.print(arr[i] +" ");
//		}
		
		int i = 0, j =arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
			
		}
		
	}

}
