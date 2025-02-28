/*Dutch National Flag Algorithm*/

package lecture_11;
import java.util.*;
public class dnf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int arr[] = {2,1,2,1,0,2,0,1,0,2};
		colorSort(arr);
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
	}
	public static void colorSort(int arr[]) {
		int n = arr.length;
		int i = 0, j = n-1, k = 0;
		while(k<=j) {
			if(arr[k] == 2) {
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				j--;
			}
			else if(arr[k] == 0) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k++;
			}
			else {
				k++;
			}
		}
		
	}
}
