//In same package things are accessible
//Here we are fetching from Student class
//Just like "new" keyword "this" is a predefined keyword in java
/*
 * For using Static variable and static function in a different class,
 * we do not need to create an object for the same.
 * 
 * We can normally access it using ClassName.variable/function()name 
 * */


package lecture_34;

public class StudentClient {
	public static void main(String[] args) {
		
		System.out.println("Hello Bye");
 		Student s = new Student();
		Student s1 = new Student();
		s.name = "Kaju";				//accessing the object created in the Heap Memory
		s.age = 31;
		
		s1.name = "Katli";
		s1.age = 22;
		
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
		s.SayHey("Pri");
		s1.SayHey("Pri");
		int i = Student.countOfStudent;					//Static variable
		Student.fub();									//Static function	
		System.out.println(i);
	}
}
