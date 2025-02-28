/*How to take userinput in case of ArrayList*/

package lecture_20;
import java.util.*;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<5; i++) {							// To take arraylist as user input
			
			list.add(sc.nextInt());
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
