package lecture_08;
import java.util.*;
public class parametrised_function {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(add(a,b));
		
	}
//	Function with return type 
//	public static void add(int a, int b) {
//		int c = a+b;
//		System.out.println(c);
//		
//	}
// Function without return type
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}

}
