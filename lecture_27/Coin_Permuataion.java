 package Lecture_27;

public class Coin_Permuataion {
	public static void main(String[] args) {
		int[] coin = {2, 3, 5, 6};
		int amount = 10;
		Printanswer(coin, amount, "");
	}
	
	// This can be done without backtracking. Since for every call we need amount = 10
	public static void Printanswer(int[] coin, int amount, String ans) {
			
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0; i<coin.length; i++) {			
			if(amount >= coin[i]) {			
				
				/*BackTracking
				 * amount -= coin[i];
				 * Printanswer(coin, amount, ans+coin[i]);
				 * amount += coin[i];
				 *  */
				Printanswer(coin, amount-coin[i], ans+coin[i]);			//no backtracking required 
			}
		}
	}
}
