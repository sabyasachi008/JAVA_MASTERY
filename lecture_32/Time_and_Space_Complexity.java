package lecture_32;

public class Time_and_Space_Complexity {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<1000_00; i++) {
			
		}
		long end = System.currentTimeMillis();
		
	
		System.out.println(end - start);
		System.out.println(0*2);
		int i = 0; 
		int n = 10;
		while(i<n) {
			System.out.println('H');				//Time complexity : O(N)		
			i = i+1;
		}
		while(i<n) {
			System.out.println('H');				//Time complexity : O(LogN)
			i = i*2;
		}
		while(n>0) {
			System.out.println('H');				//Time complexity : O(LogN) Similar as Binary Search
			n = n/2; 
		}
		
		while(i<=n) {
			System.out.println();					//Time complexity : O(N/5) |=> O(N)
			i += 2;
			i += 3;
		}
		
		while(i<= n) {
			System.out.println();					//Time complexity : O(Log N) base 6
			i *= 2;
			i *= 3;
		}
		
		while(n>0) {
			System.out.println();					//Time complexity : O(Log N) base 6
			n /=2;
			n /=3;
		}
		
		int k = 1;	 
		while(i<= n) {
			System.out.println('H');				//Time complexity : O(N/K)			//Similar as N/5
			
			i += k;
		}
		
		while(i<= n) {
			System.out.println('H');				//Time complexity : O(Log N) base k		//Similar as Log N base 5
			
			i *= k;
		}
		
		while(n>0) {
			System.out.println('H');				//Time complexity : O(N)
			n = n-1;
		}
		
		while(n>0) {
			System.out.println();					//Time complexity : O(N/5) |-> O(N)
			n = n-2;
			n = n-3;
		}
		
		while(n>0) {				
			System.out.println(); 					//Time complexity : O(N/K)
			n = n-k;
		}
		
		for(int j = 0; j<n; j++) {
			for(int p= 0; p<n; p++) {				//Time Complexity : O(N^2)
				System.out.println();
				
			}
		}
		
		for(int j  = 0; j*j<n; j++) {
				System.out.println();        		//Time Complexity : O(sqrt of N)
			}
	
		for(i = 1; i<=n; i++) {
			for(int j = 1; j<= i*i; j++) {			//Time Complexity : O(N^4)
				for(k = 1; k<=n/2; k++) {
					
				}
			}
		}
		
		for(i = 1; i<=n; i *= 2 ) {
			System.out.println(); 					//Time Complexity : O(LogN)
		}
		
		for(i = n/2; i<= n; i++) {					//Outer loop = N/2 times
			for(int j = 1; j<=n/2; j++) {			//1st inner loop = N/2 times
				for( k = 1; k<=n; k = k*2) {		//2nd inner loop = LogN times
					
					System.out.println();			//Time complexity : O(N*LogN)
					
											
				}
			}
		}
		
		int val = 1000;
		for(i = 1; i<=n; i++) {						//Time complexity : O(N*val*val)
			for(int j = 1; j<= val; j++) {				
				for(k = 1; k<=j; k++) {
					System.out.println();
				}
			}
		}
		
		for(i = 1; i<=n; i++) {						//Outer loop -> N
			for(int j = 1; j<= n; j +=1) {			//Inner loop -> LogX
				System.out.println();				//Time complexity -> O(N*LogN)
			}
		}
		
		//Bubble Sort :->
		int[] arr = {2, 4, 2, 1, 3};
		for(int turn = 1; turn<arr.length; turn++) {
			for(int j = 0; j<arr.length - turn; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];				//Time complexity -> O(N^2)
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//Selection Sort :->
		for(i = 0; i<arr.length; i++) {
			int mini = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}									//Time complexity -> O(N^2)
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		
		//Insertion Sort :->
		
		for(i = 0; i<arr.length; i++) {
			
			int item = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j] > item) {			//Time complexity -> O(N^2)
				arr[j+1] = arr[j];
				arr[j] = item;
				j--;
			}
		}
	}
}
