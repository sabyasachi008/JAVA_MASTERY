package lecture_10;
import java.util.*;
public class part_rev {
/*
 * input => {1,2,3,4,5,6,7,8,9}
 * output=> {1,2,7,6,5,4,3,8,9}
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int i = sc.nextInt();
		int j = sc.nextInt();
		revArr(arr, i, j);
		for(int k = 0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void revArr(int arr[], int i, int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
