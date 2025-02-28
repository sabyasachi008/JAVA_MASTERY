package lecture_08;

import java.util.*;
public class return_nonprarame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int a = 9;
		int b = 10;
		int c = a+b;
		System.out.println(c);
		System.out.println(Addition());			// Calling the function return value to print it self
	}
	
	public static int Addition() {
		int a = 100;
		int b = 200;
		int c = a+b;
		return c;
	
	}

}
