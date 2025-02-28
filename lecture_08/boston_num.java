package lecture_08;
import java.util.*;
public class boston_num {
	public static void main(String arg[]) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 System.out.println(bostonnum(n));
		 
	}
	
	public static boolean bostonnum(int n) {
		
		int sum = 0;				// sum of the digits of the prime factors
		int sum2 = sod(n);
		int temp  = n;
		int i = 2;
		while(i <= n) {
			while(n%i == 0) {
				sum = sum+sod(i);
				n = n/i;
			}
			i++;
			
		}
		if(sum == sum2) return true;
		else return false;
		
	}
	public static int sod(int i) {
		int sum2 = 0;
		
		while(i>0) {
			int rem = i%10;
			sum2 += rem;
			i = i/10;
		}
		return sum2;
		
	}
}
 