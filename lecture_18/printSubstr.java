
/*Program to print all the possible substring of the given string*/

package lecture_18;
import java.util.*;
public class printSubstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 				// sc.next() is used to take single word input
		printSub(s);
	}
	public static void printSub(String s) {
		for(int i = 0; i<s.length(); i++) {				//outer loop which is constant
			for(int j = i+1; j<=s.length(); j++) {			//inner loop which iterates throughout the string to print all possible substring 
				System.out.println(s.substring(i,j));
			}
		}
	}
}
