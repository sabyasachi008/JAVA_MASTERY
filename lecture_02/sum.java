package lecture_02;
import java.util.*;

public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1, sum = 0;
		while(i<=n) {
			sum = sum+i;
			i++;
		}
		System.out.println("The sum of the numbers is " +sum );
		
	}

}
