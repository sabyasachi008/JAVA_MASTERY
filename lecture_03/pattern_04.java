package lecture_03;
import java.util.Scanner;
import java.util.*;

public class pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		int number  =0;
		for(int i= 1; i<=n; i++) {
		
			for(int j = number +1; j<=i; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}

	}

}
