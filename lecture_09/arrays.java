package lecture_09;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			//indexing 0 to n-1,, where n is the size of the array
		
		
		int a[] = {12, 23, 34 ,45};		// C type array  declaration
		int [] arr = {1, 3,4, 5,4};		//JAVA type array declartation
		int n = a.length;
		display(a);
		
		int b[] = a;
		System.out.println(b[1]);
		int v = 7;
		int c =9;
		// a = 9; b = 7;
		
	}
	public static void display(int []a) {
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
			
	}

}
