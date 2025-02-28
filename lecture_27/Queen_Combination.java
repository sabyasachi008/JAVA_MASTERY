package Lecture_27;

public class Queen_Combination {
	public static void main(String[] args) {
		
		int n = 4;
		int tqueen = 2;
		boolean[] board = new boolean[n];
		
		Printanswer(board, tqueen, 0, "", 0);
		
	}
		//qpsf => queen placed so far
		//last => to keep track of the last cell and 
				//start the recursive call after that cell
	public static void Printanswer(boolean[] board, int tqueen, int qpsf, String ans, int last) {
		if(tqueen == qpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i = last; i<board.length; i++) {		//i == last is done for getting combinations
			
			if(board[i] == false) {
				board[i] = true;
				
				Printanswer(board,tqueen, qpsf+1, ans+"b"+i+"q"+qpsf, i +1);
				board[i] = false;		//backtracking the board back to false;
			}
		}
	}

}
