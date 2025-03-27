/*
 * new Person() -> object
 * Person() -> Constructor Calling
 * */


package lecture_35;

public class Person_Client {
	
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("Raj", 22);
		Person p2 = new Person("SM", 23);
		
		
		
		p.Intro_yourSelf();
		p1.Intro_yourSelf();
		p2.Intro_yourSelf();
		p2.setName("Ankit");
		p2.setAge(23);
		p1.setAge(-100);
	}

}
