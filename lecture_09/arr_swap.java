package lecture_09;

public class arr_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int c[] = {9,8,7,0,6};
		
		swap(arr, c);

//		for(int i  = 0; i<5; i++) {
//			System.out.println(arr[i]+" "+c[i]);		// the array will not swap because java is call by value not call by refference
//								// 
//			
//		}
	}
	public static void swap(int arr[], int c[]) {
		int temp[] = arr;								// the change is not reflected in the gobal variable it is only occurs in the local variable
		arr = c;
		c = temp;
		for(int i  = 0; i<5; i++) {
			System.out.println(arr[i]+" "+c[i]);
			
		}
		
	}

}
