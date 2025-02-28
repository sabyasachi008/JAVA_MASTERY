/*BackTracking is the part of recursion
 * We need to apply backtracking where recursion cannot perform some specific task. 
 * Content written in heap Memory cannot be undone by recursion
 * */  

package Lecture_27;


public class queen_Permutation {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int n = 4; // board Size

		int tqueen = 2; // total queen
		boolean[] board = new boolean[n];
  
		Printanswer(board, tqueen, 0, "");

	}

	// qpsf => queen_placed_so_far
	public static void Printanswer(boolean[] board, int tqueen, int qpsf, String ans) {

		if (tqueen == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;

				Printanswer(board, tqueen, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i] = false; // after using the block, set the board back to false so that we can reuse the
									// next cell.
			}

		}
	}
}
