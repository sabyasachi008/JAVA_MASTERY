package lecture_20;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());

		// Add element in the arrayList
		list.add(10);
		list.add(19);
		list.add(1);
		list.add(100);

		System.out.println(list);
//		// index range = 0 to size
//		list.add(2, -23);
//		System.out.println(list);
//
//		// Remove elements
//		System.out.println(list.remove(2));
//		System.out.println(list);
//
//		// Set :: doesnot add new value update the previous index value
//		list.set(2, -7);
//		System.out.println(list);
//
//		// Sort: Arraylist -> Collections.sort(list)
//		Collections.sort(list);
//		System.out.println(list);
//		
//		//Reverse a list
//		Collections.reverse(list);
//		System.out.println(list);
//		
//		//Get element of particular index
//		System.out.println(list.get(3)); 
		
		for(int i = 0; i<list.size(); i++) {				// Normal For loop
			System.out.print(list.get(i)+" ");
		}
		
		int[] arr = new int[4];
		
		for(int v : arr) {
			System.out.print(v+" ");			// For each loop
		}
		
		for(int v : list) {						// For each loop
			System.out.println(v+" ");
		}
		
		
		 
	}
}
