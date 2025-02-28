
/*Spiral Matrix
 * Time complexity : O(N)
 * LeetCode qs
 * */
package lecture_15;
import java.util.*;

public class SpiralMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();	//Rows
//		int m = sc.nextInt();	//Cols
//		int[][] arr = new int[n][m];
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[0].length; j++) {
//				arr[i][j] = sc.nextInt();
//				
//			}
//		}
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};  //3*4
		//User input for 2D-Array
		
		spiralMatrix(arr);
		
		
	}
	public static void spiralMatrix(int[][] arr) {
		int minr =0;
		int maxr =arr.length-1;
		int minc =0;
		int maxc = arr[0].length-1;
		int tE = arr.length*arr[0].length;						//TotalElements
		int count = 0;
		
		while(count<tE) {
			for(int i = minc; i<=maxc && count<tE; i++) {		//outer border top row
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			if(minr > maxr) break;
			for(int i = minr; i<=maxr && count<tE; i++) {		//outer border col
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			if(maxc<minc) break;
			for(int i = maxc; i>=minc && count<tE; i--) {  		//outer border down row	
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			if(maxr<minr) break;
			for(int i = maxr; i>=minr && count<tE; i--) {		//outer border left most col
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
			if(minc>maxc) break;
			
		}
		
	}
}
