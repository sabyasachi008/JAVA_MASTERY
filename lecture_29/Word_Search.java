/*LeetCode Question : 79. Word Search
 * 
 * PS: Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, 
 * where adjacent cells are horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 * Horizontal Neighboring : left or right
 * Vertical neighboring : upward or downward
 * The same letter cell may not be used more than once. =>> Means that the cell we are visiting, 
 * we should not visit it again
 * */
package lecture_29;

public class Word_Search {
	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		// 2D matrix ke upar loop lagega jahan se Word ka 0th character milega wohan se
		// start hoga iteration..

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (word.charAt(0) == board[i][j]) {
					boolean ans = WordSearch(board, i, j, word, 0);		//word Index
					
					if(ans == true) {
						System.out.println(ans);
						return;
					}
				}
			}
		}
		System.out.println(false);

	}

	public static boolean WordSearch(char[][] board, int cr, int cc, String word, int windex) {
		if(windex == word.length()) {
			return true;
		}
		
		if(cc < 0 || cr <0 || cc>=board[0].length || cr>=board.length || word.charAt(windex) != board[cr][cc]) {
			return false;
		}
		board[cr][cc] = '*';
		int[] r = {-1, 1, 0, 0};
		int[] c = {0, 0, 1, -1};
		for(int i = 0; i<c.length; i++) {
			boolean ans = WordSearch(board, cr+r[i], cc+c[i], word, windex+1);
			if(ans == true) {
				return ans;
			}
		}
		board[cr][cc] = word.charAt(windex);

		return false;
	}

}
