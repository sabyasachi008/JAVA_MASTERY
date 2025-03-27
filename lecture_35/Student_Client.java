package lecture_35;

public class Student_Client {
	
	public static void main(String[] args) throws Exception{
		
		Student s = new Student("Ravi", 24);
		System.out.println("Hey");
		s.Intro_yourSelf();
		s.setAge(90);
		System.out.println("Bye");
		s.Intro_yourSelf();
		
	}
}
