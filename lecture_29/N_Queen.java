package lecture_29;

import java.util.Scanner;

public class N_Queen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n]; // to keep track of wether the queen is placed or not placed

		nQueen(board, 0, n);

	}

	// tq =>> total queen == n [Board Size]
	public static void nQueen(boolean[][] board, int row, int tq) {
		if(tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col) == true) { // function to check weather placing the queen is safe or not

				board[row][col] = true;
				nQueen(board, row + 1, tq - 1); // since a queen is placed recursive call with one less queen
				board[row][col] = false;/*Backtrack
				*  Because recursion won't undo, and we have to reuse the cell so  we have to set the cell to false
				*  to get all possible paths.
				*/

			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		
		int r = row;
		//Check Upward 
		while(r>=0) {
			if(board[r][col] == true) {			//if queen present in any of the upward blocks
				return false;
				
			}
			r--;
		}
		
		//Check Right Diagonal
		r = row;
		int c = col;
		while(r>=0 && c<board.length) {
			if(board[r][c] == true) {			//if queen present in any of the right diagonals
				return false;
			}
			c++;
			r--;
		}
		
		//Check Left Diagonal
		r = row;
		c = col;
		
		while(r>=0 && c>=0) {
			if(board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}

		return true;			//if it is safe to place the queen at that location
	}
	
	public static void Display(boolean[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
