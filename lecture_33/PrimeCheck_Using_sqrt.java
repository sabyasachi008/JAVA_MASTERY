package lecture_33;
import java.util.*;
public class PrimeCheck_Using_sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(isPrime(n));
		
	}
	
	public static boolean isPrime(int n) {
		int i = 2;
		
		while(i*i<n) {
			if(n%i == 0) {							//Time comlpexity : O(SqrtN)
				return false;
			}
			i++;
		}
		return true;
	}
}
