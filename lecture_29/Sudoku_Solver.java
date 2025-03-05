package lecture_29;

public class Sudoku_Solver {
	public static void main(String[] args) {

		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		SudokuSolver(grid, 0, 0);
	}

	public static void SudokuSolver(int[][] grid, int row, int col) {
		if (col == 9) {
			row++; // if last column then increment row
			col = 0; // reset column to the first column
		}

		if (row == 9) { // When it reaches the last row =>9
			Display(grid); // Print
			return;
		}

		if (grid[row][col] != 0) { // Not equal to zero means already filled
			SudokuSolver(grid, row, col + 1); // Move to check the next column3

		} else {
			for (int val = 1; val <= 9; val++) {
				if (isitsafe(grid, row, col, val) == true) { // if found safe then
					grid[row][col] = val; // update the value
					SudokuSolver(grid, row, col + 1);
					grid[row][col] = 0; // backtrack
				}
			}
		}
	}

	public static void Display(int[][] grid) { // function to display 2D matrix
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isitsafe(int[][] grid, int row, int col, int val) { // Function to check is it safe to place
																				// at that particular block

		for (int i = 0; i < grid.length; i++) {		//When col fixed row will vary 
			if (grid[i][col] == val) {				//if found while iteration through the  same col
				return false;						// return false
			}
		}

		for (int i = 0; i < grid.length; i++) {		//When row fixed col will vary
			if (grid[row][i] == val) {				//if found while iteration through the same row
				return false;						// return false;
			}
		}
		// For checking 3X3
		int r = row - row % 3;						//To get the starting point row of 3x3
		int c = col - col % 3;						//To get the starting point col of 3x3

		for (int i = r; i < r + 3; i++) {			// iterating within 3X3row 
			for (int j = c; j < c + 3; j++) {		// iterating within 3X3col
				if (grid[i][j] == val) {			// Check wether the value is present in the individual 3X3 matrices

					return false;					// If present return false

				}
			}
		}

		return true;								//If not statisfies the above condition return true;
	}

}
