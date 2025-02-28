/*ArrayList is initially of defined for size 10

 * 
 * grows by *1.5
 * Copies the data into a new Array and delete the previous smaller array
 */

package lecture_20;
import java.util.ArrayList;
import java.util.Scanner;

public class Internal_Working {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(39);
		list.add(2);
		list.add(1);
		list.add(10);
		
		System.out.println(list);
		ArrayList<Integer> n = new ArrayList<>();
		
		System.out.println(n.size());
		
		
	}
}
