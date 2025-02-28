package lecture_15;
import java.util.*;

public class PrintwaveCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		displayWave(arr);
	}
	public static void displayWave(int[][] arr) {
		for(int col = 0; col<arr[0].length; col++) {
			if(col % 2 == 0) {		//For even col the rows list will be printed downwards to upwards
				for(int row = 0; row<arr.length; row++) {
					System.out.print(arr[row][col]+" ");
				}
			} else {
				for(int row = arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}
}

/*Hard code 2D Array input:: 
 * int[][] arr = {{1,2,3,4},
 * 				  {5,6,7,8},
 * 				  {9,10,11,12},
 * 	     		  {13,14,15,16}};
 * */
/*output :: 1 5 9 13 14 10 6 2 3 7 11 15 16 12 8 4  */