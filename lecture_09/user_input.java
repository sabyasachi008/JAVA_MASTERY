package lecture_09;
import java.util.*;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);

	}
	public static void display(int arr[]) {
		System.out.print("The array is ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" " );
		}
	}

}
