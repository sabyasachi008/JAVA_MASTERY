package lecture_17;
import java.util.*;

/*String POOL concept*/
//variable is in stack memory and the content is in heap memory
//String pool is a space in heap memory where duplicate values are not allowed to store
//in string pool string literals are stored 
//similar as copying an array   int [] arr = {1,2,3};  int [] temp = arr;

// Garbage collection in java is performed by JVM where unused or not required part of the code is removed by the java virtual machine

//Strings are immutable


public class string_1 {
	public static void main(String args[]) {
		String s = "Hello";                    //this form in the string pool where both of them 
											//points to same address in the heap memory inside the pool
		
		String s1 = "Hello";                     //this form in the string pool where both of them 
											//points to same address in the heap memory inside the pool
		String s2 = new String("Hello");
		 
		
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2); 
	}
}
