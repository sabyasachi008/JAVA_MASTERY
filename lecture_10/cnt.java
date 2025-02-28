package lecture_10;

public class cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1294234234;
		int cnt = 0;
		while(n>0) {
			n = n/10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
