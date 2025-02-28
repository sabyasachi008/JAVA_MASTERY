package lecture_09;

import java.util.Arrays;

public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,566,6,5}; // hard code declaration
				
		swap(arr[0], arr[1]);
		Wswap(arr[0], arr[1]);
		display(arr);
		;
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swap(int a, int b) {
		int temp =a; 
		a = b;
		b = temp;
		System.out.print("The swap using third variable");
		System.out.println("a = "+a+" b = "+b);
	}
	public static void Wswap(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.print("Swap without using the thrid variable ");
		System.out.println("a = "+a+" b = "+b);
	}

}
