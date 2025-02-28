package lecture_08;

public class function_01 {

	public static void main(String[] args) {
		// NON Parametraised function
		System.out.println("Hello welcome to gb road");
//		public static void main is the name of the method \
		//JVM checks where the main method is present in the code and where ever the main method is present in the code the function starts from there  
		int a= 9;
		addition();

		int b = 10;
		addition();

		int c = a+b;
		addition();
		System.out.println(c);
		
	}
	public static void addition() {				// Non paramterised function
		
		int a = 8;
		int b = 10;
		int c = a+b;
		
		System.out.println(c);				
				
		
	}

}
