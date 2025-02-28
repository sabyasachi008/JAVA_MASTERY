/*Question :: You are given an N*M grid. Each cell(i, j) in the grid is either blocked or empty. The rat can move
 * from position towards left, right, up or down on the grid.
 * Initially rat is on the position(1,1). It wants to reach position(N,M) where it's cheese is waiting for. There
 * exist an unique path in the grid, Find the path and help the rat to reach its chesse
 * 
 * Input Format :: Frist Line contains 2 Integer N and M denoting the rows and columns in the grid.
 * Next N line contains M Characters each. An 'X' in position(i, j) denotes that the cells is blocked and ans '
 * 'O'
 * 
 * Output Format :: Print N lines, containing M integer each. A 1 at a position(i, j) denotes that the (i, j)th
 *					cell is covered in the path and a 0 denotes that the cell is not covered in the path.
 *					If a path does not exits then print  "NO PATH FOUND"
 *  Sample Input ::
 *   5 4
 *   0X00		
 *   000X		
 *   X0X0
 *   X00X
 *   XX00
 *   
 *   //0>>EMPTY    		//X>>BLOCKED
 *   PRINT UNIQUE PATH
 *   IF NO PATH EXITS THEN PRINT NO PATH FOUND
 *   
 *   Sample output ::
 *   1000
 *   1100
 *   0100
 *   0110
 *   0011
 *   
 *   
 *  * */

package lecture_28;

import java.util.*;

public class Rat_Chase_Chesse {
	
	static boolean found = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] maze = new char[n][m]; // create a character array
		for (int i = 0; i < maze.length; i++) {

			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		// create a 2d array for answer
		int[][] ans = new int[n][m]; // intitially contains 0 which will be replaced by 1 for the unique path

		ratinmaze(maze, 0, 0, ans);
		if(found == false) {
			System.out.println("NO PATH FOUND");
		}
	}

	// cc => Current Column [0]
	// cr => Current Row [0]
	public static void ratinmaze(char[][] maze, int cc, int cr, int[][] ans) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') { // if the rat is in last cell
			
			ans[cr][cc] = 1;
			Display(ans);
			System.out.println();
			found = true;
			return;
		}
		if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {	//check index in range
													//and if x is marked  then return
			return;
		}
		maze[cr][cc] = 'X'; //Marked blocked so that doesnot reuse
		ans[cr][cc] = 1; // assign where ever path is possible based in the above condition
		// jis cell se char direction prr call lag raha h udhar 1 se replace kr de

		ratinmaze(maze, cc, cr - 1, ans);
		ratinmaze(maze, cc, cr + 1, ans);
		ratinmaze(maze, cc - 1, cr, ans);
		ratinmaze(maze, cc + 1, cr, ans);

		// BackTrack for undoing..// so that if we dont get answer from any particular way we can reuse it
		maze[cr][cc] = '0';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) { // To print we need integer 2D array
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}
}
