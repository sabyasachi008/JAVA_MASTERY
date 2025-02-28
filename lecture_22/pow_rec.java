package lecture_22;
import java.util.*;
public class pow_rec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(CalPower(a, b));
		
	}
	public static int CalPower(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		int pow =  CalPower(a , b-1);
 		return a*pow;
	}
}
