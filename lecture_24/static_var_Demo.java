package lecture_24;

import java.util.*;

public class static_var_Demo {

	static int val = 1000; // this is a static variable it is declared inside the class instead of a
							// function and it can be accessed from any function including the main method

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(val); // This calls the global variable

		fun();
		System.out.println(val); // This calls the global variable

	}

	public static void fun() {
		System.out.println("hello");
		int val = 500; 				// local variable defined
		val = val + 6; 					// local variable gets more preference than gobal variable
		System.out.println(val);
		static_var_Demo.val = static_var_Demo.val -1;	//can be accessed by
												//classname.gobal_variable
		  
	}
}
