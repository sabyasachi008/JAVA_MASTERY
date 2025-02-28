package lecture_08;
  
import java.util.Scanner;

public class armstrong_num {
	// Function to check armstrong number
	public static boolean armno(int n) {
		int ans = 0;
		int temp = n;
		while(n>0) {
			int c = 0;
			int rem = n%10;
			ans = (int) (ans + Math.pow(rem,length(temp)));
			n = n/10;
		
		}
		if(ans == temp) {
			return true;
		} else return false;
	}  
	
	// function to check the number of digits
	public static int length(int temp) {
		int cnt = 0;
		while(temp>0) {
			cnt++;
			temp = temp/10;
			
		}
		return cnt;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		
		System.out.println(armno(n));
	}
}
