package lecture_17;
import java.util.*;
public class stringArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"he", "was", "a", "good", "man"};			// this is how to take String inputs in an array hard code
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("he");
		arr1.add("works");
		
		Collections.reverse(arr1);
		System.out.println(arr1);
	}
} 
