/*LeetCode Question : 79. Word Search
 * 
 * PS: Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, 
 * where adjacent cells are horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 * Horizontal Neighboring : left or right
 * Vertical neighboring : upward or downward
 * */
package lecture_29;

public class Word_Search {
	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		//2D matrix ke upar loop lagega jahan se Word ka 0th character milega wohan se start hoga iteration.. 
		
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(word.charAt(0) == board[i][j]) {
					boolean ans = WordSearch(board, i, j, word, 0);
				}
			}
		}
		 
		

	}
	
	public static boolean WordSearch(char[][] board, int i, int j, String word, int start) {
		
		return true;
	}

}
