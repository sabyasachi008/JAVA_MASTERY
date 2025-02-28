package lecture_26;
import java.util.*;
	
public class Tower_of_Hanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//RODS
		String src = "A";
		String helpr = "B";
		String dest = "C";
		
		TOH(n, src, helpr, dest);
	}
	
	public static void TOH(int n, String src, String helpr, String dest) {
		
		
		if(n == 0) {
			return;
		}
		TOH(n-1, src, dest, helpr);
		System.out.println("MOVE "+n+"th disc from "+src+" to "+dest);
		
		TOH(n-1, helpr, src, dest);
		
		
	}
}
