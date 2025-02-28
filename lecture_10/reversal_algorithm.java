package lecture_10;
import java.util.*;
public class reversal_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7};
		
		RotateArr(arr, k);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
	}
	public static void RotateArr(int arr[], int k) {
		int n = arr.length;
		k = k%n;						//So that to avoid the repeatation of order
		ReverseRange(arr, 0, n-k-1);	//Reverse of 0 to n-k range
		ReverseRange(arr,n-k, n-1);		//Reverse of last k elements
		ReverseRange(arr, 0, n-1 );		//Reverse of the whole array
	}
	//Code for reverse range 
	public static void ReverseRange(int arr[], int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
