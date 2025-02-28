package lecture_18;

import java.util.*;

public class findCbNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		// 692239

		printSubString(s);

	}

	// to print substring length wise 
	public static void printSubString(String s) { 
		int count = 0;
		boolean[] vis = new boolean[s.length()];
		for (int len = 1; len < s.length(); len++) {
			for (int j = len; j < s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);
//				System.out.println(str); // to print the substring length wise
				if(isCbNumber(Long.parseLong(str)) == true && isVisited(vis, i, j-1) == true) {
					count++;
					for(int k = i; k<j; k++) {
						vis[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean isCbNumber(long n) {
		if(n==0 || n==1) {
			return false;
			
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == n) {
				return true;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(n%arr[i] == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	//to check whether the number is previously visited or not
	public static boolean isVisited(boolean[] vis, int i, int j) {
		for(int k = i; k <= j; k++) {
			if(vis[k] == true) {
				return false;
			}
		}
		return true;
	} 
}
