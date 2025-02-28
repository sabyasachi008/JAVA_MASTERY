
/**Give a dice has 3 faces{1,2,3} 
 * destination n = 4
 * calculate the possible outcomes through recursion*/
package lecture_24;

import java.util.*;

public class Boat_Path {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BoatPath(0, n, ""); // Start, destination, empty String
	}

	public static void BoatPath(int cur, int n, String ans) {
		
		if(cur == n) {
			System.out.println(ans);
			return;
		}
		
		if(cur> n) {
			return;
		}
		// Since the recursive calls are the same put these in a for loop
		for(int dice = 1; dice<=3; dice++) {
			
			BoatPath(cur + dice, n, ans + dice); // Integer + String = String(Implicit conversion
			
		}


	}
}
