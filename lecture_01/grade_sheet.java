package lecture_01;

import java.util.Scanner;

public class grade_sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you marks");
		int marks = sc.nextInt();
		if(marks >70 && marks <79) System.out.println("A");
		else if(marks <70 && marks>60) System.out.println("B");
		else if(marks<60 && marks>50) System.out.println("C");
		else if(marks>40 && marks<50) System.out.println("D");
		else System.out.println("FAIL");
		

	}

}
