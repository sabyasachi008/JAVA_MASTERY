package lecture_07;
import java.util.Scanner;
public class inverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 1;
		int res =0;
		while(n>0) {
			int rem = n%10;
			res = (int) (res +pos*Math.pow(10, rem-1)); 			//postion * (rem-1)
			n = n/10;
			pos++;
		}
		System.out.println(res);
	}

}
