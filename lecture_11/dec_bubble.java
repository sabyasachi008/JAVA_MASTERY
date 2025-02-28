package lecture_11;
import java.util.*;


/*Bubble sort in descending order*/
public class dec_bubble {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int arr[] = {4,2,-1,4,5,3,9,100};
		
		bubDesc(arr);
	}
	
	public static void bubDesc(int arr[]) {
		for(int turn = 1; turn<arr.length; turn++) {
			for(int i = 0; i<arr.length-turn; i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
