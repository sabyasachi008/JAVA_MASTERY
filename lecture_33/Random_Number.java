/*Can be used to generate random number within any particular range given
 * Can also be used in webDev project where we have to generate a random OTP to login
 * */
package lecture_33;
import java.util.Random;
public class Random_Number {
	public static void main(String[] args) {
		
		int lo = 10;
		int high = 100;
		
		Random rn = new Random();
		for(int i = 0; i<6; i++) {
			int r = rn.nextInt(high - lo + 1) + lo;		//high-low + 1 -> bound
														//bound should be greater than 0 so we are doing +1
														//+lo so that the number we get is in range
			System.out.print(r+" ");
		}
	}

	
}
