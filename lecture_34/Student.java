package lecture_34;

public class Student {
	String name;
	int age;
	int dob;
	static int countOfStudent;

	public void Intro_yourSelf() { // Non Static function
		System.out.println("My Name is " + name + " and age is " + age);
	}

	public void SayHey(String name) {
		System.out.println(name + " say hi " + this.name);
	}

	public static void fub() {
		// Static function
	}

	static { 		// This is called Static Block.
					// When ever the class is used the static blocks executes itself first on its own.
					//Block Doesnot needs to be called it executes on its own.

		System.out.println("Hi All welcome to dumchuttar");
	}
	//Iss class ke koi bhi line chalne se phele static block chalega
	//Static matlab object kitni bar bhi banao woh "Static variable/function/Block ek hi bar chalega.
}
