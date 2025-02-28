package lecture_01;
import java.util.*;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j<=2*i -3; j++) {
				System.out.print(" ");
			}
			if(i>1) {
				System.out.print("*");
			}
			System.out.println();
		}
		 for (int i = n - 1; i >= 1; i--) {
	            // Spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Stars
	            System.out.print("*");
	            for (int j = 1; j <= 2 * i - 3; j++) {
	                System.out.print(" ");
	            }
	            if (i > 1) {
	                System.out.print("*");
	            }

	            System.out.println();
		 }
	}

}
