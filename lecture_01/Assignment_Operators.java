package lecture_01;
import java.util.*;
public class Assignment_Operators {
		//Assignment Operators
	public static void main(String[] args) {
		
//		int x = 9;
//		x += 9;
//		x *=9;
//		x -= 9;
//		
//		System.out.println(x);
//		
//		int p = 9;
//		p -= 7;
//		System.out.println(p);
//		p %= 5;
//		System.out.println(p);
//		if(p%5 == 2) {
//			System.out.println("True");
//		}
		//Logical Operators
		/*
		 * &&
		 * ||
		 * !(&&)
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the P, R, T");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		
		int si = (p*r*t)/100;
		System.out.println("The simple Interest = "+si);
		System.out.println("Amount ="+ (si+p));
		
	}

}
