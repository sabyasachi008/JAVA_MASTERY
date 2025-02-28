package lecture_11;
import java.util.*;
public class bsOptimised {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {5,3,2};
		srtOpti(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
	
		}
	}
	public static void srtOpti(int arr[]) {
		for(int turn = 1; turn<arr.length; turn++) {
			boolean run = false;
			for(int i = 0; i<arr.length - turn; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					run = true;
				}
			}
			if(run == false) {
				System.out.println(run);
				break;
			} 
		}
	}
}
