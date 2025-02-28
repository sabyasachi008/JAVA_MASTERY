package lecture_22;

import java.util.*;

public class print_Rec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;

		printRec(n);
	}


	public static int printRec(int n) {
		if (n == 0) {						//base case to avoid stackoverflow
			
			return 1;
		}
		System.out.println(n);
		return printRec(n-1) ;				//recursive call 
	}
}
