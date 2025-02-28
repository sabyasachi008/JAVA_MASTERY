/*Wrapper Class : When primitive data types are not applicable 
 *we use non primitive data type 
 *which are also known as Wrapper class*/

package lecture_20;

import java.util.*;

public class Wrapper_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = 10;
		int a1 = 10;
//		System.out.println(a == a1); // When primitive and Non Primitive data type are compared
										// Then the values are compared
		a = a1; // Autoboxing :: When primitive is stored in non primitive datatype

		Integer b = 190;
		int b1 = 19;

		b1 = b; // Onboxing :: When non primitive data type is stored in primitive datatype
		Integer c = 12;
		Integer c1 = 12;
		Integer d = 167;
		Integer d1 = 167; 
		System.out.println(c == c1);		//True
		System.out.println(d == d1);		//False
	
	}
}
