package lecture_17;

import java.util.*;

public class string_userinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		String s1 = sc.nextLine();
//		System.out.println(s);
//		System.out.println(s1);

		String s = "HelloByeOkayHey";
		String s2 = "HelloByeOkayHey";
		System.out.println(s.length()); // .length() is a method the brackets define it is a method
		System.out.println(s.charAt(9)); // used to access particular index character of the string
		System.out.println(s.equals(s2)); // Tell that both strings contents are same or not
		String s1 = "Raju";
		String s3 = "Raj";

		System.out.println(s1.compareTo(s3)); // if s2>s3 +ve or s3>s2 -ve or s3 == s2 0

		String sub = s.substring(4); // Substring : This method is use to find the substring of the string
		System.out.println(sub); 		// single index takes substring from range of i to i+1
		

	}
}
