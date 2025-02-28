package lecture_03;
import java.util.Scanner;

public class pattern_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		for(i = 1;i<=n;i++) {
			for(j = 1;j<=i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
