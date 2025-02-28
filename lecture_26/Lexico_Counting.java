package lecture_26;
import java.util.*;

public class Lexico_Counting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1000;
		
		Counting(0, n);
	}
	
	public static void Counting(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		
		int i = 0;
		
		if(curr == 0) {
			i = 1;
		}
		
		for(; i<=9; i++) {
			Counting(curr*10+i, n);
		}
	}
}
