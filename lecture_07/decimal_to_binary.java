package lecture_07;
import java.util.*;

public class decimal_to_binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;
			sum = sum+rem*mul;
			n = n/2;
			mul = mul *10;
			
		}
		System.out.println(sum);
	}
}
