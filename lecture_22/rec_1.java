package lecture_22;
import java.util.*;
public class rec_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 5;
		System.out.println(factorial(n));;
	}
	public static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		
		int fn = factorial(n-1);			//recursive call 
		return n*fn; 
	}

}
